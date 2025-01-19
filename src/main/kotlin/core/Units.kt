package org.example.core

val Int.px: String
    get() = "${this}px"

val Int.cm: String
    get() = "${this}cm"

val Int.em: String
    get() = "${this}em"

val Int.rem: String
    get() = "${this}rem"

