package day1

import java.io.File

fun main(args : Array<String>)
{
    val input = File("src/day1/input.txt").absoluteFile.readLines()

    part1(input)
    part2(input)
}

fun part1(input: List<String>)
{
    var totalFreq = 0

    for (freq in input) {
        totalFreq += freq.toInt()
    }

    println(totalFreq)
}

fun part2(input: List<String>)
{
    var totalFreq = 0
    val frequencies: MutableList<Int> = mutableListOf(0)

    var index = 0
    do {
        val freq = input[index].toInt()
        totalFreq += freq
        frequencies.add(totalFreq)
        //println(frequencies)

        index++
        if (index > input.lastIndex) index = 0

    } while (frequencies.count { it == totalFreq } != 2)

    println(totalFreq)
}

