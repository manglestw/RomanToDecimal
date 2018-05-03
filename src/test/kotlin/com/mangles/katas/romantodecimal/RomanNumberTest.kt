package com.mangles.katas.romantodecimal

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class RomanNumberTest : Spek({
    describe("transform a roman symbol to decimal"){
        it("should return 0 when value is empty"){
            val decimal:Int = RomanNumber().toDecimal("")
            assertEquals(0, decimal)
        }
        it("should return 1 when value is I"){
            val decimal:Int = RomanNumber().toDecimal("I")
            assertEquals(1, decimal)
        }
        it("should return 5 when value is V"){
            val decimal:Int = RomanNumber().toDecimal("V")
            assertEquals(5, decimal)
        }
        it("should return 10 when value is X"){
            val decimal:Int = RomanNumber().toDecimal("X")
            assertEquals(10, decimal)
        }
        it("should return 50 when value is L"){
            val decimal:Int = RomanNumber().toDecimal("L")
            assertEquals(50, decimal)
        }
        it("should return 100 when value is C"){
            val decimal:Int = RomanNumber().toDecimal("C")
            assertEquals(100, decimal)
        }
        it("should return 500 when value is D"){
            val decimal:Int = RomanNumber().toDecimal("D")
            assertEquals(500, decimal)
        }
        it("should return 1000 when value is M"){
            val decimal:Int = RomanNumber().toDecimal("M")
            assertEquals(1000, decimal)
        }
    }

})