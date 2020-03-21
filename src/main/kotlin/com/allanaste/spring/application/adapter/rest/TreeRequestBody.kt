package com.allanaste.spring.application.adapter.rest

import com.allanaste.spring.domain.BloomTime
import com.allanaste.spring.domain.Tree

data class TreeRequestBody (
    val name: String,
    val description: String,
    val botanicalName: String,
    val family: String,
    val bloomTime: String,
    val maxHeight: String
) {
    fun toTree() = Tree(
        name = name,
        description = description,
        botanicalName = botanicalName,
        family = family,
        bloomTime = BloomTime.valueOf(bloomTime),
        maxHeight = maxHeight.toInt()
    )
}
