package com.duda.battlesnake

data class Game(
        val id: String?,
        val ruleset: RuleSet?,
        val timeout: Int?,
        val source: String?
)

data class RuleSet(
        val name: String?,
        val version: String?
)

data class MoveRequest(
        var game: Game?,
        var ruleset: RuleSet?,
        var turn: Int?,
        var board: Board?,
        var you: Snake?,
)

class Snake(
        var id: String?,
        var name: String?,
        var health: Int?,
        var body: Array<Location>?,
        var latency: String?,
        var head: Location?,
        var length: Int?,
        var shout: String?,
        var squad: String?,
)

class Location(
        val x: Int,
        val y: Int
)

class Board(
        var height: Int,
        var width: Int,
        var food: Array<Location>,
        var hazard: Array<Location>,
        var snakes: Array<Snake>,
)
