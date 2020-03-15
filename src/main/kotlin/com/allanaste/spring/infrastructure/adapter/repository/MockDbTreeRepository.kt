package com.allanaste.spring.infrastructure.adapter.repository

import com.allanaste.spring.domain.BloomTime
import com.allanaste.spring.domain.Tree
import com.allanaste.spring.domain.port.repository.TreeRepository
import org.springframework.stereotype.Component

// output adapter, driven adapter or secondary adapter

@Component
class MockDbTreeRepository : TreeRepository {

    override fun getTreeById(id: Int) =
        Tree(
            id = id,
            name = "European plum",
            description = "Typically it forms a large shrub, or a small tree. " +
                    "It may be somewhat thorny, with white blossom, borne in early spring.",
            botanicalName = "Prunus domestica",
            family = "Rosaceae-Rose family",
            bloomTime = BloomTime.SPRING,
            maxHeight = 15
    )
}
