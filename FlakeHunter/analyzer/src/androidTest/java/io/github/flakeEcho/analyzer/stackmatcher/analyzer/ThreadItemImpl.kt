package io.github.flakeEcho.analyzer.stackmatcher.analyzer

import io.github.flakeEcho.analyzer.stackmatcher.core.ThreadItem

class ThreadItemImpl(
    override val name: String,
    override val threadId: Int
): ThreadItem {
    override fun toString() = name
}
