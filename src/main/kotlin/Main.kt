package org.example

import org.example.core.model.Body
import org.example.core.model.html
import org.example.core.px
import org.example.core.style.Modifier

fun main() {
    val a = html() {
        head { title { +"Hello" } }
        body {
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
    println(a)
}