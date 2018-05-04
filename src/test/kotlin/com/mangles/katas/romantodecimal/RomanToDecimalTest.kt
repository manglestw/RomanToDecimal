package com.mangles.katas.romantodecimal

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class RomanToDecimalTest : Spek({
    describe("a roman to decimal calculator"){
        it("should return 2 when value is II"){
            val decimal:Int = RomanToDecimal().convert("II")
            assertEquals(2, decimal)
        }
        it("should return 150 when value is CL"){
            val decimal:Int = RomanToDecimal().convert("CL")
            assertEquals(150, decimal)
        }
        it("should return 4 when value is IV"){
            val decimal:Int = RomanToDecimal().convert("IV")
            assertEquals(4, decimal)
        }
        it("should return 3 when value is IIV"){
            val decimal:Int = RomanToDecimal().convert("IIV")
            assertEquals(3, decimal)
        }
    }
})