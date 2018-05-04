package com.mangles.katas.romantodecimal

class RomanNumber {

    fun calculateDecimal(romanNumber: String): Int {
        var decimal = 0
        var maxValue = 0
        for (i in romanNumber.length - 1 downTo 0){
            when {
                isSmallerThanMaxValueSoFar(romanNumber, i, maxValue) -> decimal -= toDecimal(romanNumber[i].toString())
                else -> {
                    decimal +=toDecimal(romanNumber[i].toString())
                    maxValue = decimal
                }
            }
        }
        return decimal
    }

    private fun isSmallerThanMaxValueSoFar(romanNumber: String, i: Int, maxValue: Int) =
        toDecimal(romanNumber[i].toString()) < maxValue

    fun toDecimal(romanNumber: String):Int{
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
