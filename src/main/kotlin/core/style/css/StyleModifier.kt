package org.example.core.style.css

import org.example.core.style.Modifier
import org.example.core.style.ModifierImpl

class StyleModifier: ModifierImpl(styles = emptyMap()) {
    override val styles: MutableMap<String, String> = mutableMapOf()

    override fun copyWith(style: Pair<String, String>) : StyleModifier {
        styles[style.first] = style.second
        return this
    }

    override fun buildStyle(): String {
        return styles.entries.joinToString("; ") { "${it.key}: ${it.value}" }
    }
}