package com.duda.battlesnake

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GameRestApi {
    @PostMapping("/start")
    fun start(startRequest: MoveRequest) {
        return;
    }

    @PostMapping("/move")
    fun move(moveRequest: MoveRequest): MoveRes {
        return MoveRes("up")
    }

    @PostMapping("/end")
    fun end(endRequest: MoveRequest) {
        return
    }
}

