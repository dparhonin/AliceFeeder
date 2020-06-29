package ru.depsy.alicefeeder

import io.micronaut.runtime.Micronaut.*

fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("ru.depsy.alicefeeder")
		.start()
}

