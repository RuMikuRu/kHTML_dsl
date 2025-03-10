package org.example.core.model

import org.example.core.style.Modifier
import org.example.core.style.ModifierImpl
import org.example.core.style.css.StyleModifier

class Base : BodyTag("base")
class BaseFont : BodyTag("basefont")
class Bdi : BodyTag("bdi")
class Bdo : BodyTag("bdo")
class BgSound : BodyTag("bgsound")
class Big : BodyTag("big")
class Blink : BodyTag("blink")
class BlockQuote : BodyTag("blockquote")
class Br : BodyTag("br")
class Button : BodyTag("button")
class Canvas : BodyTag("canvas")
class Caption : BodyTag("caption")
class Center : BodyTag("center")
class Cite : BodyTag("cite")
class Code : BodyTag("code")
class Col : BodyTag("col")
class ColGroup : BodyTag("colgroup")
class Command : BodyTag("command")
class Comment : BodyTag("comment")
class DataList : BodyTag("datalist")
class DD : BodyTag("dd")
class Del : BodyTag("del")
class Details : BodyTag("details")
class Dfn : BodyTag("dfn")
class Dir : BodyTag("dir")
class Div : BodyTag("div")
class Dl : BodyTag("dl")
class Dt : BodyTag("dt")
class Em : BodyTag("em")
class Embed : BodyTag("embed")
class FieldSet : BodyTag("fieldset")
class FigCaption : BodyTag("figcaption")
class figure : BodyTag("figure")
class Font : BodyTag("font")
class Footer : BodyTag("footer")
class Form : BodyTag("form")
class Frame : BodyTag("frame")
class FrameSet : BodyTag("frameset")
class Body : BodyTag("body")
class B : BodyTag("b")
class A : BodyTag("a") {
    var href: String
        get() = attributes["href"]!!
        set(value) {
            attributes["href"] = value
        }
}

class P : BodyTag("p")
class H1 : BodyTag("h1")
class H2 : BodyTag("h2")
class H3 : BodyTag("h3")
class H4 : BodyTag("h4")
class H5 : BodyTag("h5")
class H6 : BodyTag("h6")
class Header : BodyTag("header")
class Head : HeadTag("head")
class HGroup : BodyTag("hgroup")
class Hr : BodyTag("hr")
class I : BodyTag("i")
class IFrame : BodyTag("iframe")
class Img : BodyTag("img")
class Input : BodyTag("input")
class Ins : BodyTag("ins")
class IsIndex : BodyTag("isindex")
class KBD : BodyTag("kbd")
class KeyGen : BodyTag("keygen")
class Label : BodyTag("label")
class Legend : BodyTag("legend")
class Li : BodyTag("li")
class Link : BodyTag("link")
class Listing : BodyTag("listing")
class Main : BodyTag("main")
class Map : BodyTag("map")
class Mark : BodyTag("mark")
class Marquee : BodyTag("marquee")
class Menu : BodyTag("menu")
class Meta : BodyTag("meta")
class Meter : BodyTag("meter")
class MultiCoil : BodyTag("multicoil")
class Nav : BodyTag("nav")
class Nobr : BodyTag("nobr")
class Noembed : BodyTag("noembed")
class NoFrames : BodyTag("noframes")
class NoScript : BodyTag("noscript")
class Object : BodyTag("object")
class Ol : BodyTag("ol")
class OptGroup : BodyTag("optgroup")
class Option : BodyTag("option")
class Output : BodyTag("output")
class Param : BodyTag("param")
class PlainText : BodyTag("plaintext")
class Pre : BodyTag("pre")
class Progress : BodyTag("progress")
class Q : BodyTag("q")
class RP : BodyTag("rp")
class RT : BodyTag("rt")
class Ruby : BodyTag("ruby")
class S : BodyTag("s")
class Samp : BodyTag("samp")
class Script : BodyTag("script")
class Section : BodyTag("section")
class Select : BodyTag("select")
class Small : BodyTag("small")
class Source : BodyTag("source")
class Spacer : BodyTag("spacer")
class Span : BodyTag("span")
class Strike : BodyTag("strike")
class Strong : BodyTag("strong")
class Style : HeadTag("style") {
    private val styleRules = StringBuilder()

    override operator fun String.unaryPlus() {
        styleRules.append(this).append("\n")
    }

    fun rule(
        selector: String? = null,
        id: String? = null,
        classNames: List<String> = emptyList(),
        init: StyleModifier.() -> Unit
    ) {
        val fullSelector = buildSelector(selector ?: "", id, classNames)
        val modifier = StyleModifier()
        modifier.init()
        styleRules.append("$fullSelector { ${modifier.buildStyle()} }\n")
    }

    private fun buildSelector(baseSelector: String, id: String?, classNames: List<String>): String {
        val idSelector = id?.let { "#$it" } ?: ""
        val classSelector = if (classNames.isNotEmpty()) classNames.joinToString(".", ".") else "" // Fix: Only add "." if classNames is not empty

        val combinedSelector = "$baseSelector$idSelector$classSelector".trim()

        // Fix: Remove any trailing "." resulting from empty baseSelector and only id/classes
        return if (combinedSelector.endsWith(".")) combinedSelector.dropLast(1) else combinedSelector
    }


    override fun render(builder: StringBuilder, indent: String) {
        builder.append("$indent<style>\n")
        builder.append(styleRules.toString())  // Append the styles
        builder.append("$indent</style>\n")
    }
}

class Sub : BodyTag("sub")
class Summary : BodyTag("summary")
class Sup : BodyTag("sup")
class Table : BodyTag("table")
class TBody : BodyTag("tbody")
class Td : BodyTag("td")
class TextArea : BodyTag("textarea")
class TFoot : BodyTag("tfoot")
class Th : BodyTag("th")
class THead : BodyTag("thead")
class Time : BodyTag("time")
class Tr : BodyTag("tr")
class Track : BodyTag("track")
class TT : BodyTag("tt")
class U : BodyTag("u")
class UL : BodyTag("ul")
class Var : BodyTag("var")
class Video : BodyTag("video")
class WBR : BodyTag("wbr")
class XMP : BodyTag("xmp")
class Abbr : BodyTag("abbr")
class Acronym : BodyTag("acronym")
class Address : BodyTag("address")
class Applet : BodyTag("applet")
class Area : BodyTag("area")
class Article : BodyTag("article")
class Aside : BodyTag("aside")
class Audio : BodyTag("audio")
