package com.github.cedi99.mytheme.services

import com.intellij.openapi.project.Project
import com.github.cedi99.mytheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
