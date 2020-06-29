package ru.depsy.alicefeeder

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import kotlin.random.Random

@Controller("/say")
class SayController {
    private val phrases = SayController::class.java.getResource("/phrases.txt").readText().split("\r", "\n")

    @Get("/phrase")
    @Produces("text/plain; charset=utf-8")
    fun get(): String {
        val randomIndex = Random(System.currentTimeMillis()).nextInt(0, phrases.size)
        return phrases[randomIndex]
    }
}