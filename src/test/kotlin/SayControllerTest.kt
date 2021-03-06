package ru.depsy.alicefeeder

import io.micronaut.http.HttpRequest
import io.micronaut.http.client.RxHttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.annotation.MicronautTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest
class SayControllerTest {
    @Inject
    @field:Client("/")
    lateinit var client: RxHttpClient

    @Test
    fun testSay() {
        val request: HttpRequest<Any> = HttpRequest.GET("/say/phrase")
        val body = client.toBlocking().retrieve(request)
        Assertions.assertNotNull(body)
        println("Response: $body")
    }
}