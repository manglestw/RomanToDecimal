package com.mangles.katas.romantodecimal

class RomanToDecimal {
    fun convert(number: String): Int {

        return RomanNumber().calculateDecimal(number)
    }


}
