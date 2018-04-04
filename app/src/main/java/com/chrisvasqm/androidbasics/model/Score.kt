package com.chrisvasqm.androidbasics.model

class Score {
    val points
        get() = value

    private var value = 0

    fun increaseBy(points: Int) {
        value += points
    }

    fun reset() {
        value = 0
    }
}