package com.allanaste.spring.domain.port.service

import com.allanaste.spring.domain.Tree
import com.allanaste.spring.domain.port.repository.TreeRepository
import org.springframework.stereotype.Service

// input port or driver port

@Service
class TreeService(
    private val treeRepository: TreeRepository
) {
    fun getTreeById(id: Int) :Tree? = treeRepository.findById(id)

    fun createTree(tree: Tree) = treeRepository.save(tree)
}
