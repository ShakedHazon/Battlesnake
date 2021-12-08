package com.duda.battlesnake

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.random.Random

@RestController
class GameRestApi {
    @PostMapping("/start")
    fun start(startRequest: MoveRequest) {
        return;
    }

    @PostMapping("/move")
    fun move(moveRequest: MoveRequest): MoveRes {
        val directions = listOf("up", "down", "left", "right")
        val direction = directions[Random.nextInt(directions.size)]
        return MoveRes(direction)
    }

    @PostMapping("/end")
    fun end(endRequest: MoveRequest) {
        return
    }
}

