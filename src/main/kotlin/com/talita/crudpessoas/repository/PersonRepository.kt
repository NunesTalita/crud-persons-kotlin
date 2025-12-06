package com.talita.crudpessoas.repository

import com.talita.crudpessoas.entity.Person
import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepository: JpaRepository<Person, Long>