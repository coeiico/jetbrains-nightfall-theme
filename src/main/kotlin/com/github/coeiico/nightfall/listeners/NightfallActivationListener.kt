package com.github.coeiico.nightfall.listeners

import com.intellij.openapi.application.ApplicationActivationListener
import com.intellij.openapi.wm.IdeFrame

internal class NightfallActivationListener : ApplicationActivationListener {

    override fun applicationActivated(ideFrame: IdeFrame) {
        // thisLogger().warn("Modify corresponding registration entries in `plugin.xml`.")
    }
}
