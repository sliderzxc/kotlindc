package com.sliderzxc.plugin.kotlindc

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class DecompileToBytecodeAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        Messages.showMessageDialog("Hello", "Title", Messages.getInformationIcon())
    }
}
