package com.allanaste.spring.domain

data class Tree(
    val id: Int,
    val name: String,
    val description: String,
    val botanicalName: String,
    val family: String,
    val bloomTime: BloomTime,
    val maxHeight: Int
)

enum class BloomTime { SPRING, SUMMER, FALL, WINTER }
