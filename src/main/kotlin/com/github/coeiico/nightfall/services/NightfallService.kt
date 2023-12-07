package com.github.coeiico.nightfall.services

import com.intellij.openapi.components.Service
import com.intellij.openapi.diagnostic.thisLogger
import com.intellij.openapi.project.Project
import com.github.coeiico.nightfall.NightfallBundle

@Service(Service.Level.PROJECT)
class NightfallService(project: Project) {

    init {
        thisLogger().info(NightfallBundle.message("projectService", project.name))
        // thisLogger().warn("Modify corresponding registration entries in `plugin.xml`.")
    }

    fun getRandomNumber() = (1..100).random()
}
