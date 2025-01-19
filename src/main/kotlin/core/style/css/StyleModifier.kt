package org.example.core.style.css

import org.example.core.style.Modifier
import org.example.core.style.ModifierImpl

class StyleModifier: Modifier {
    private val styles: MutableMap<String, String> = mutableMapOf()

    private fun copyWith(style: Pair<String, String>) : StyleModifier {
        styles[style.first] = style.second
        return this
    }

    override fun background(value: String) = copyWith("background" to value)

    override fun backgroundAttachment(value: String) = copyWith("background-attachment" to value)

    override fun backgroundClip(value: String) = copyWith("background-clip" to value)

    override fun backgroundImage(value: String) = copyWith("background-image" to value)

    override fun backgroundOrigin(value: String) = copyWith("background-origin" to value)

    override fun backgroundPosition(value: String) = copyWith("background-position" to value)

    override fun backgroundRepeat(value: String) = copyWith("background-repeat" to value)

    override fun backgroundSize(value: String) = copyWith("background-size" to value)

    override fun border(value: String) = copyWith("border" to value)

    override fun borderBottom(value: String) = copyWith("border-bottom" to value)

    override fun borderBottomColor(value: String) = copyWith("border-bottom-color" to value)

    override fun borderBottomStyle(value: String) = copyWith("border-bottom-style" to value)

    override fun borderBottomWidth(value: String) = copyWith("border-bottom-width" to value)

    override fun borderCollapse(value: String) = copyWith("border-collapse" to value)

    override fun borderColor(value: String) = copyWith("border-color" to value)

    override fun borderLeft(value: String) = copyWith("border-left" to value)

    override fun borderLeftColor(value: String) = copyWith("border-left-color" to value)

    override fun borderLeftStyle(value: String) = copyWith("border-left-style" to value)

    override fun borderLeftWidth(value: String) = copyWith("border-left-width" to value)

    override fun borderRight(value: String) = copyWith("border-right" to value)

    override fun borderRightColor(value: String) = copyWith("border-right-color" to value)

    override fun borderRightStyle(value: String) = copyWith("border-right-style" to value)

    override fun borderRightWidth(value: String) = copyWith("border-right-width" to value)

    override fun borderSpacing(value: String) = copyWith("border-spacing" to value)

    override fun borderStyle(value: String) = copyWith("border-style" to value)

    override fun borderTop(value: String) = copyWith("border-top" to value)

    override fun borderTopColor(value: String) = copyWith("border-top-color" to value)

    override fun borderTopStyle(value: String) = copyWith("border-top-style" to value)

    override fun borderTopWidth(value: String) = copyWith("border-top-width" to value)

    override fun borderWidth(value: String) = copyWith("border-width" to value)

    override fun clear(value: String) = copyWith("clear" to value)

    override fun clip(value: String) = copyWith("clip" to value)

    override fun color(value: String) = copyWith("color" to value)

    override fun cursor(value: String) = copyWith("cursor" to value)

    override fun direction(value: String) = copyWith("direction" to value)

    override fun display(value: String) = copyWith("display" to value)

    override fun emptyCells(value: String) = copyWith("empty-cells" to value)

    override fun float(value: String) = copyWith("float" to value)

    override fun fontWeight(value: String) = copyWith("font-weight" to value)

    override fun height(value: String) = copyWith("height" to value)

    override fun left(value: String) = copyWith("left" to value)

    override fun letterSpacing(value: String) = copyWith("letter-spacing" to value)

    override fun lineHeight(value: String) = copyWith("line-height" to value)

    override fun listStyle(value: String) = copyWith("list-style" to value)

    override fun listStyleImage(value: String) = copyWith("list-style-image" to value)

    override fun listStylePosition(value: String) = copyWith("list-style-position" to value)

    override fun listStyleType(value: String) = copyWith("list-style-type" to value)

    override fun marginBottom(value: String) = copyWith("margin-bottom" to value)

    override fun marginLeft(value: String) = copyWith("margin-left" to value)

    override fun marginRight(value: String) = copyWith("margin-right" to value)

    override fun marginTop(value: String) = copyWith("margin-top" to value)

    override fun maxHeight(value: String) = copyWith("max-height" to value)

    override fun maxWidth(value: String) = copyWith("max-width" to value)

    override fun minHeight(value: String) = copyWith("min-height" to value)

    override fun minWidth(value: String) = copyWith("min-width" to value)

    override fun opacity(value: String) = copyWith("opacity" to value)

    override fun overflow(value: String) = copyWith("overflow" to value)

    override fun paddingBottom(value: String) = copyWith("padding-bottom" to value)

    override fun paddingLeft(value: String) = copyWith("padding-left" to value)

    override fun paddingRight(value: String) = copyWith("padding-right" to value)

    override fun paddingTop(value: String) = copyWith("padding-top" to value)

    override fun position(value: String): Modifier {
        return copyWith("position" to value)
    }

    override fun right(value: String): Modifier {
        return copyWith("right" to value)
    }

    override fun tableLayout(value: String): Modifier {
        return copyWith("table-layout" to value)
    }

    override fun textAlign(value: String): Modifier {
        return copyWith("text-align" to value)
    }

    override fun textDecoration(value: String): Modifier {
        return copyWith("text-decoration" to value)
    }

    override fun textIndent(value: String): Modifier {
        return copyWith("text-indent" to value)
    }

    override fun textTransform(value: String): Modifier {
        return copyWith("text-transform" to value)
    }

    override fun top(value: String): Modifier {
        return copyWith("top" to value)
    }

    override fun verticalAlign(value: String): Modifier {
        return copyWith("vertical-align" to value)
    }

    override fun visibility(value: String): Modifier {
        return copyWith("visibility" to value)
    }

    override fun width(value: String): Modifier {
        return copyWith("width" to value)
    }

    override fun wordSpacing(value: String): Modifier {
        return copyWith("word-spacing" to value)
    }

    override fun zIndex(value: String): Modifier {
        return copyWith("z-index" to value)
    }
    override fun padding(value: String): Modifier {
        return copyWith("padding" to value)
    }

    override fun margin(value: String): Modifier {
        return copyWith("margin" to value)
    }

    override fun backgroundColor(color: String): Modifier {
        return copyWith("background-color" to color)
    }

    override fun fontSize(size: String): Modifier {
        return copyWith("font-size" to size)
    }

    override fun alignContent(value: String): Modifier {
        return copyWith("align-content" to value)
    }

    override fun alignItems(value: String): Modifier {
        return copyWith("align-items" to value)
    }

    override fun alignSelf(value: String): Modifier {
        return copyWith("align-self" to value)
    }

    override fun aspectRatio(value: String): Modifier {
        return copyWith("aspect-ratio" to value)
    }

    override fun backfaceVisibility(value: String): Modifier {
        return copyWith("backface-visibility" to value)
    }

    override fun backgroundBlendMode(value: String): Modifier {
        return copyWith("background-blend-mode" to value)
    }

    override fun backgroundPositionX(value: String): Modifier {
        return copyWith("background-position-x" to value)
    }

    override fun backgroundPositionY(value: String): Modifier {
        return copyWith("background-position-y" to value)
    }

    override fun borderBottomLeftRadius(value: String): Modifier {
        return copyWith("border-bottom-left-radius" to value)
    }

    override fun borderBottomRightRadius(value: String): Modifier {
        return copyWith("border-bottom-right-radius" to value)
    }

    override fun borderImageOutset(value: String): Modifier {
        return copyWith("border-image-outset" to value)
    }

    override fun borderImageRepeat(value: String): Modifier {
        return copyWith("border-image-repeat" to value)
    }

    override fun borderImageSlice(value: String): Modifier {
        return copyWith("border-image-slice" to value)
    }

    override fun borderImageSource(value: String): Modifier {
        return copyWith("border-image-source" to value)
    }

    override fun borderImageWidth(value: String): Modifier {
        return copyWith("border-image-width" to value)
    }

    override fun borderTopLeftRadius(value: String): Modifier {
        return copyWith("border-top-left-radius" to value)
    }

    override fun borderTopRightRadius(value: String): Modifier {
        return copyWith("border-top-right-radius" to value)
    }

    override fun captionSide(value: String): Modifier {
        return copyWith("caption-side" to value)
    }

    override fun caretColor(value: String): Modifier {
        return copyWith("caret-color" to value)
    }

    override fun boxSizing(value: String): Modifier {
        return copyWith("box-sizing" to value)
    }

    override fun columnCount(value: String): Modifier {
        return copyWith("column-count" to value)
    }

    override fun columnFill(value: String): Modifier {
        return copyWith("column-fill" to value)
    }

    override fun columnGap(value: String): Modifier {
        return copyWith("column-gap" to value)
    }

    override fun columnRuleColor(value: String): Modifier {
        return copyWith("column-rule-color" to value)
    }

    override fun columnRuleStyle(value: String): Modifier {
        return copyWith("column-rule-style" to value)
    }

    override fun columnRuleWidth(value: String): Modifier {
        return copyWith("column-rule-width" to value)
    }

    override fun columnSpan(value: String): Modifier {
        return copyWith("column-span" to value)
    }

    override fun columnWidth(value: String): Modifier {
        return copyWith("column-width" to value)
    }

    override fun flex(value: String): Modifier {
        return copyWith("flex" to value)
    }

    override fun flexBasis(value: String): Modifier {
        return copyWith("flex-basis" to value)
    }

    override fun flexDirection(value: String): Modifier {
        return copyWith("flex-direction" to value)
    }

    override fun flexFlow(value: String): Modifier {
        return copyWith("flex-flow" to value)
    }

    override fun flexGrow(value: String): Modifier {
        return copyWith("flex-grow" to value)
    }

    override fun flexShrink(value: String): Modifier {
        return copyWith("flex-shrink" to value)
    }

    override fun flexWrap(value: String): Modifier {
        return copyWith("flex-wrap" to value)
    }

    override fun gridAutoColumns(value: String): Modifier {
        return copyWith("grid-auto-columns" to value)
    }

    override fun gridAutoFlow(value: String): Modifier {
        return copyWith("grid-auto-flow" to value)
    }

    override fun gridAutoRows(value: String): Modifier {
        return copyWith("grid-auto-rows" to value)
    }

    override fun gridColumn(value: String): Modifier {
        return copyWith("grid-column" to value)
    }

    override fun gridColumnEnd(value: String): Modifier {
        return copyWith("grid-column-end" to value)
    }

    override fun gridColumnStart(value: String): Modifier {
        return copyWith("grid-column-start" to value)
    }

    override fun gridRow(value: String): Modifier {
        return copyWith("grid-row" to value)
    }

    override fun gridRowEnd(value: String): Modifier {
        return copyWith("grid-row-end" to value)
    }

    override fun gridRowGap(value: String): Modifier {
        return copyWith("grid-row-gap" to value)
    }

    override fun gridRowStart(value: String): Modifier {
        return copyWith("grid-row-start" to value)
    }

    override fun gridTemplateColumns(value: String): Modifier {
        return copyWith("grid-template-columns" to value)
    }

    override fun gridTemplateRows(value: String): Modifier {
        return copyWith("grid-template-rows" to value)
    }

    override fun justifyContent(value: String): Modifier {
        return copyWith("justify-content" to value)
    }

    override fun justifyItems(value: String): Modifier {
        return copyWith("justify-items" to value)
    }

    override fun justifySelf(value: String): Modifier {
        return copyWith("justify-self" to value)
    }

    override fun order(value: String): Modifier {
        return copyWith("order" to value)
    }

    override fun overflowX(value: String): Modifier {
        return copyWith("overflow-x" to value)
    }

    override fun overflowY(value: String): Modifier {
        return copyWith("overflow-y" to value)
    }

    override fun textOverflow(value: String): Modifier {
        return copyWith("text-overflow" to value)
    }

    override fun wordBreak(value: String): Modifier {
        return copyWith("word-break" to value)
    }

    override fun boxShadow(value: String): Modifier {
        return copyWith("box-shadow" to value)
    }

    override fun transform(value: String): Modifier {
        return copyWith("transform" to value)
    }

    override fun transformOrigin(value: String): Modifier {
        return copyWith("transform-origin" to value)
    }

    override fun transition(value: String): Modifier {
        return copyWith("transition" to value)
    }

    override fun transitionDelay(value: String): Modifier {
        return copyWith("transition-delay" to value)
    }

    override fun transitionDuration(value: String): Modifier {
        return copyWith("transition-duration" to value)
    }

    override fun transitionProperty(value: String): Modifier {
        return copyWith("transition-property" to value)
    }

    override fun transitionTimingFunction(value: String): Modifier {
        return copyWith("transition-timing-function" to value)
    }

    override fun buildStyle(): String {
        return styles.entries.joinToString("; ") { "${it.key}: ${it.value}" }
    }
}