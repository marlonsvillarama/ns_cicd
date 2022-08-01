package com.github.marlonsvillarama.nscicd.services

import com.intellij.openapi.project.Project
import com.github.marlonsvillarama.nscicd.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
