package br.com.erudio.controller

import br.com.erudio.model.Person
import br.com.erudio.services.PersonServices
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
@RequestMapping("/person")
class PersonController {

    val counter: AtomicLong = AtomicLong()

    @Autowired
    private lateinit var service: PersonServices

    @RequestMapping
        (value = ["/{id}"], method = [RequestMethod.GET],
        produces = [org.springframework.http.MediaType.APPLICATION_JSON_VALUE])

    fun findById(@PathVariable(value = "id") id: Long): Person {
        return service.findById(id)


} @RequestMapping
        (method = [RequestMethod.GET],
        produces = [org.springframework.http.MediaType.APPLICATION_JSON_VALUE])
    fun findAll(): List<Person> {
        return service.findAll()
    }
}