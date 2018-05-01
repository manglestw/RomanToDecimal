package com.mangles.katas.romantodecimal

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class RomanToDecimalTest : Spek({
    describe("a roman to decimal calculator"){
        it("should return 0 when value is empty"){
            val decimal:Int = RomanToDecimal().convert("")
            assertEquals(0, decimal)
        }
        it("should return 1 when value is I"){
            val decimal:Int = RomanToDecimal().convert("I")
            assertEquals(1, decimal)
        }
        it("should return 5 when value is V"){
            val decimal:Int = RomanToDecimal().convert("V")
            assertEquals(5, decimal)
        }
        it("should return 10 when value is X"){
            val decimal:Int = RomanToDecimal().convert("X")
            assertEquals(10, decimal)
        }
        it("should return 50 when value is L"){
            val decimal:Int = RomanToDecimal().convert("L")
            assertEquals(50, decimal)
        }
        it("should return 100 when value is C"){
            val decimal:Int = RomanToDecimal().convert("C")
            assertEquals(100, decimal)
        }
        it("should return 500 when value is D"){
            val decimal:Int = RomanToDecimal().convert("D")
            assertEquals(500, decimal)
        }
        it("should return 1000 when value is M"){
            val decimal:Int = RomanToDecimal().convert("M")
            assertEquals(1000, decimal)
        }
        it("should return 2 when value is II"){
            val decimal:Int = RomanToDecimal().convert("II")
            assertEquals(2, decimal)
        }
        it("should return 150 when value is CL"){
            val decimal:Int = RomanToDecimal().convert("CL")
            assertEquals(150, decimal)
        }
    }
})