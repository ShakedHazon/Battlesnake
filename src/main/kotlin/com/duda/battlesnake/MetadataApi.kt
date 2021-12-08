package com.duda.battlesnake


import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MetadataRest {
    @GetMapping("/")
    fun metaData(): Metadata {
        return Metadata();
    }
}

data class Metadata(
        val apiversion: String? = "1",
        val author: String? = "Shaked Hazon",
        val color: String? = "#888888",
        val head: String? = "default",
        val tail: String? = "default",
        val version: String? = "0.0.1-beta"
)
