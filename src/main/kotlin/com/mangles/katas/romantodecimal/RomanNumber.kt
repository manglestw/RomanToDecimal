package com.mangles.katas.romantodecimal

class RomanNumber {

    fun calculateDecimal(romanNumber: String): Int {
        var decimal = 0
        for (romanSymbol in romanNumber){
            decimal += toDecimal(romanSymbol.toString())
        }
        return decimal
    }

    private fun toDecimal(romanNumber: String):Int{
        return when (romanNumber) {
            "I" -> 1
            "V" -> 5
            "X" -> 10
            "L" -> 50
            "C" -> 100
            "D" -> 500
            "M" -> 1000
            else -> 0
        }
    }

}
