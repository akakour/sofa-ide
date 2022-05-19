package com.github.akakour.sofaide.services

import com.intellij.openapi.project.Project
import com.github.akakour.sofaide.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
