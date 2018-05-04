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
        it("should return 3 when value is III"){
            val decimal:Int = RomanToDecimal().convert("III")
            assertEquals(3, decimal)
        }
        it("should return 4 when value is IV"){
            val decimal:Int = RomanToDecimal().convert("IV")
            assertEquals(4, decimal)
        }
        it("should return 6 when value is VI"){
            val decimal:Int = RomanToDecimal().convert("VI")
            assertEquals(6, decimal)
        }
        it("should return 6 when value is VII"){
            val decimal:Int = RomanToDecimal().convert("VII")
            assertEquals(7, decimal)
        }
        it("should return 8 when value is VIII"){
            val decimal:Int = RomanToDecimal().convert("VIII")
            assertEquals(8, decimal)
        }
        it("should return 9 when value is IX"){
            val decimal:Int = RomanToDecimal().convert("IX")
            assertEquals(9, decimal)
        }
        it("should return 87 when value is LXXXVII"){
            val decimal:Int = RomanToDecimal().convert("LXXXVII")
            assertEquals(87, decimal)
        }
        it("should return 150 when value is CL"){
            val decimal:Int = RomanToDecimal().convert("CL")
            assertEquals(150, decimal)
        }
        it("should return 521 when value is DXXI"){
            val decimal:Int = RomanToDecimal().convert("DXXI")
            assertEquals(521, decimal)
        }
        it("should return 1990 when value is MCM"){
            val decimal:Int = RomanToDecimal().convert("MCM")
            assertEquals(1900, decimal)
        }
        it("should return 1890 when value is MXCM"){
            val decimal:Int = RomanToDecimal().convert("MXCM")
            assertEquals(1890, decimal)
        }
        it("should return 2100 when value is MMC"){
            val decimal:Int = RomanToDecimal().convert("MMC")
            assertEquals(2100, decimal)
        }
        it("should return 3000 when value is MMM"){
            val decimal:Int = RomanToDecimal().convert("MMM")
            assertEquals(3000, decimal)
        }
    }
})