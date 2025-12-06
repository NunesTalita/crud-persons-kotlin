package com.talita.crudpessoas.service

import com.talita.crudpessoas.entity.Person
import com.talita.crudpessoas.repository.PersonRepository
import org.springframework.stereotype.Service

@Service
class PersonService (
    private val personRepository: PersonRepository
) {
    fun findAll(): List<Person> = personRepository.findAll()

    fun savePerson(person: Person): Person {
        return personRepository.save(person)
    }

    fun findById(id: Long): Person {
        return personRepository.findById(id)
            .orElseThrow {NoSuchElementException("Person with id $id not found")}
    }
    fun updatePerson(id: Long, updatePerson: Person): Person {
        val existingPerson = findById(id)
        existingPerson.firstName = updatePerson.firstName
        existingPerson.lastName = updatePerson.lastName
        existingPerson.age = updatePerson.age
        return personRepository.save(existingPerson)
    }
    fun deletePerson(id: Long) {
        val person = findById(id)
        personRepository.delete(person)
    }

}

