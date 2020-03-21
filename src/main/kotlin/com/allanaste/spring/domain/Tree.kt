package com.allanaste.spring.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Tree(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0,
    var name: String,
    var description: String,
    var botanicalName: String,
    var family: String,
    var bloomTime: BloomTime,
    var maxHeight: Int
)

enum class BloomTime { SPRING, SUMMER, FALL, WINTER }
