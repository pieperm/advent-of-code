package day1

import java.io.File

fun readLines(fileName: String): List<String>
    = File(fileName).bufferedReader().readLines()

