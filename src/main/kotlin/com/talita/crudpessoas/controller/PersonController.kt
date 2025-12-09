package com.talita.crudpessoas.controller

import com.talita.crudpessoas.entity.Person
import com.talita.crudpessoas.service.PersonService
import org.springframework.http.ResponseEntity
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
    fun getAllPersons(): ResponseEntity<List<Person>> {
        val persons = personService.findAll()
        return ResponseEntity.ok(persons)
    }

    @GetMapping("/{id}")
    fun getPersonById(@PathVariable id: Long): ResponseEntity<Person> {
        val person = personService.findById(id)
        return ResponseEntity.ok(person)
    }

    @PostMapping
    fun createPerson(@RequestBody person: Person): ResponseEntity<Person> {
        val saved = personService.savePerson(person)
        return ResponseEntity.status(201).body(saved)
    }

    @PutMapping("/{id}")
    fun updatePerson(
        @PathVariable id: Long,
        @RequestBody person: Person
    ): ResponseEntity<Person> {
        val updated = personService.updatePerson(id, person)
        return ResponseEntity.ok(updated)
    }

    @DeleteMapping("/{id}")
    fun deletePerson(@PathVariable id: Long): ResponseEntity<Void> {
        personService.deletePerson(id)
        return ResponseEntity.noContent().build()
    }

}