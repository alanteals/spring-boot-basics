package com.allanaste.spring.application.adapter.rest

import com.allanaste.spring.domain.port.service.TreeService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

//input adapter, driver adapter or primary adapter

@RestController
class TreeController(
    private val treeService: TreeService
) {
    @GetMapping(path= ["/tree/{treeId}"])
    fun getTree(@PathVariable("treeId") treeId: Int) = ResponseEntity.ok(treeService.getTreeById(treeId))
}
