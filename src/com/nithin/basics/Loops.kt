package com.nithin.basics

/**
 * @author: nithinpb
 * @since: 7/3/17
 */

fun main(args: Array<String>) {

    for (a in 1..100) {
        println(a)
    }

    for (a in 100..1) {
        println(a)
    }

    for (a in 100 downTo 1 step 5) {
        println(a)
    }

    val capitals = listOf("London", "Bangalore")
    for (cap in capitals) {
        println(cap)
    }

    outloop@ for (i in 1..100) {
        inloop@ for (j in 1..50) {
            if (j % 9 == 0) {
                break@inloop
            }
            println("i: $i, j: $j")
        }
        println("only i: $i")
    }
}
