package com.allanaste.spring.domain.port.repository

import com.allanaste.spring.domain.Tree

// output port or driven port

interface TreeRepository {

    fun findById(id : Int): Tree?

    fun save(tree: Tree): Tree
}
