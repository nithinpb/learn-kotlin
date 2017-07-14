package com.nithin.basics

/**
 * @author: nithinpb
 * @since: 7/3/17
 */
fun main(args: Array<String>) {
    var myString = "Hello"

    if(myString != "") {
        println("Not empty")
    } else if (myString.startsWith("H")) {
        println("Startswith H")
    }

    val result = if (myString.startsWith("K")) {
        20
    } else {
        30
    }
    println(result)

    val whenResult = when(result) {
        is Int -> {
            println("This is an int")
            475
        }
        3 -> println("This is a string")
        else -> println("Default")
    }

    println(whenResult)
}