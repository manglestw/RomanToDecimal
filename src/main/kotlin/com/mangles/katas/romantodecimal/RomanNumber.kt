package com.mangles.katas.romantodecimal

class RomanNumber {

    fun calculateDecimal(romanNumber: String): Int {
        var decimal = 0
        for (i in romanNumber.indices){
            decimal += if (isSmallerThanNextSymbol(romanNumber, i)){
                -toDecimal(romanNumber[i].toString())

            }else {
                toDecimal(romanNumber[i].toString())
            }
        }
        return decimal
    }

    private fun isSmallerThanNextSymbol(romanNumber: String, i: Int) =
        toDecimal(romanNumber[i].toString()) < toDecimal(romanNumber.elementAtOrNull(i + 1).toString())

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
