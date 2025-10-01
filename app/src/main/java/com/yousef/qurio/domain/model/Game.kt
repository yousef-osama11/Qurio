package com.yousef.qurio.domain.model

data class Game(
    val date: String,
    val genre: GameGenre,
    val duration: String,
    val coinChange: Int,
    val stars: Int
)
