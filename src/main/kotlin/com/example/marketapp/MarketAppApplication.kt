package com.example.marketapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MarketAppApplication

fun main(args: Array<String>) {
    runApplication<MarketAppApplication>(*args)
}
