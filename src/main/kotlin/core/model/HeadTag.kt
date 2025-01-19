package org.example.core.model

abstract class HeadTag(name:String) : TagWithText(name) {
    fun title(init: Title.() -> Unit) = initTag(Title(), init)
    fun style(init: Style.() -> Unit) = initTag(Style(), init)
}