package org.example

import org.example.core.model.html
import org.example.core.px
import org.example.core.style.Modifier
import java.io.File

fun main() {
    val a = html() {
        head { title { +"Hello" }
        style {
            rule(selector = "p") {
                color("blue")
                fontSize(16.px)
            }
        }}
        body() {
            p {
                attributes.put("id", "tut")
                +"Я являюсь P"
            }
            h1(modifier = Modifier.Default.margin("10px")) {
                attributes.put("id", "title")
                attributes.put("class", "title")
                attributes.put("style", "color: red")
                +"Hello world"
            }
            a(href = "https://google.com", modifier = Modifier.Default
                .margin(10.px).fontSize("20px")) {

            }
        }
    }
    val outputFile = File("output.html")
    outputFile.writeText(a.toString())
    println(a)
}