package com.allanaste.spring.infrastructure.adapter.repository

import com.allanaste.spring.domain.Tree
import com.allanaste.spring.domain.port.repository.TreeRepository
import org.springframework.data.repository.CrudRepository

// output adapter, driven adapter or secondary adapter

interface H2DbTreeRepository : CrudRepository<Tree, Int>, TreeRepository