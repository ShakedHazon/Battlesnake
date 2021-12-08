package com.duda.battlesnake

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.random.Random

@RestController
class GameRestApi {

    private var utils = Utils()

    @PostMapping("/start")
    fun start(startRequest: MoveRequest) {
        return;
    }

    @PostMapping("/move")
    fun move(moveRequest: MoveRequest): MoveRes {
        if (moveRequest.you?.head?.x == null || moveRequest.you?.head?.y == null) {
            return MoveRes("up")
        }
        val right = Location(moveRequest.you?.head?.x!! + 1, moveRequest.you!!.head!!.y)
        if (utils.hasAnyObstacle(right, board = moveRequest.board!!))
            return MoveRes("right")
        val left = Location(moveRequest.you?.head?.x!! - 1, moveRequest.you!!.head!!.y)
        if (utils.hasAnyObstacle(left, board = moveRequest.board!!))
            return MoveRes("left")
        val up = Location(moveRequest.you?.head?.x!!, moveRequest.you!!.head!!.y + 1)
        if (utils.hasAnyObstacle(up, board = moveRequest.board!!))
            return MoveRes("up")
        val down = Location(moveRequest.you?.head?.x!!, moveRequest.you!!.head!!.y - 1)
        if (utils.hasAnyObstacle(down, board = moveRequest.board!!))
            return MoveRes("down")
        return MoveRes("up")
    }

    @PostMapping("/end")
    fun end(endRequest: MoveRequest) {
        return
    }
}

