package com.pras.mytipcalculator

import org.junit.Assert.assertEquals
import org.junit.Test

internal class TipCalculatorTests {

    @Test
    fun calculate_20_percent_tip_no_roundup() {
        val amount = 10.00
        val tipPercent = 20.00
        val expectedTip = "IDR2.00"
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }
}
