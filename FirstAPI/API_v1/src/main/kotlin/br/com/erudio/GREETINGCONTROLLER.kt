package br.com.erudio

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong


@RestController
class GREETINGCONTROLLER {

    val counter: AtomicLong = AtomicLong()

    @RequestMapping("/GREETING")
    fun greet(): GREETING {
        return GREETING(counter.incrementAndGet(), content = "Hello")
    }
}