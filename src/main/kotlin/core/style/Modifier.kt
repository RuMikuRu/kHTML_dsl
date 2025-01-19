package org.example.core.style

interface Modifier {
    fun onClick(click: String): Modifier
    fun attribute(key: String, value: String): Modifier
    fun padding(value: String): Modifier
    fun margin(value: String): Modifier
    fun build(): Map<String, String>

    companion object {
        val Default: Modifier = ModifierImpl(emptyMap())
    }
}

class ModifierImpl(private val attributes: Map<String, String>) : Modifier {

    override fun onClick(click: String): Modifier {
        return copyWith("onclick" to click)
    }

    override fun attribute(key: String, value: String): Modifier {
        return copyWith(key to value)
    }

    override fun padding(value: String): Modifier {
        return copyWith("padding" to value)
    }

    override fun margin(value: String): Modifier {
        return copyWith("margin" to value)
    }

    override fun build(): Map<String, String> = attributes

    private fun copyWith(pair: Pair<String, String>): Modifier {
        return ModifierImpl(attributes + pair)
    }
}