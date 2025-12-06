package com.talita.crudpessoas.controller

import com.talita.crudpessoas.entity.Person
import com.talita.crudpessoas.service.PersonService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/persons")
class PersonController (
    private val personService: PersonService
) {

    @GetMapping
    fun getAllPersons() = personService.findAll()

    @GetMapping("/{id}")
    fun getPersonById(@PathVariable id: Long) = personService.findById(id)

    @PostMapping
    fun createPerson(@RequestBody person: Person) = personService.savePerson(person)

    @PutMapping("/{id}")
    fun updatePerson(
        @PathVariable id: Long,
        @RequestBody person: Person
    ) = personService.updatePerson(id, person)

    @DeleteMapping("/{id}")
    fun deletePerson(@PathVariable id: Long) = personService.deletePerson(id)

}