package com.duda.battlesnake

class Utils {
    fun hasHasard(location: Location, board: Board): Boolean {
        return board.hazard.any { it.x == location.x && it.y == location.y }
    }

    fun hasEnemy(location: Location, board: Board): Boolean {
        return board.snakes.map { it.body }.any {
            it?.contains(Location(location.x, location.y)) ?: false
        }
    }

    fun hasWall(location: Location, board: Board): Boolean {
        return location.x < board.width && location.y < board.height && location.x >= 0 && location.y >= 0
    }

    fun hasAnyObstacle(location: Location, board: Board): Boolean {
        return hasHasard(location, board) || hasEnemy(location, board) || hasWall(location, board)
    }
}
