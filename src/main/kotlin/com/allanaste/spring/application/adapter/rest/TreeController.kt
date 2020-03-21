package com.allanaste.spring.application.adapter.rest

import com.allanaste.spring.domain.Tree
import com.allanaste.spring.domain.port.service.TreeService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

//input adapter, driver adapter or primary adapter

@RestController
@RequestMapping("tree")
class TreeController(
    private val treeService: TreeService
) {
    @GetMapping(path= ["/{treeId}"])
    fun getTree(@PathVariable("treeId") treeId: Int): ResponseEntity<Tree> {
        val tree = treeService.getTreeById(treeId)
        return if (tree != null)
            ResponseEntity.ok(tree)
        else
            ResponseEntity.notFound().build()
    }

    @PostMapping
    fun addTree(@RequestBody treeRequestBody: TreeRequestBody) = treeService.createTree(treeRequestBody.toTree())
}
