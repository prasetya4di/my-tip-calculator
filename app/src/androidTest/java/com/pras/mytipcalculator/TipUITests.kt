package com.pras.mytipcalculator

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import com.pras.mytipcalculator.ui.theme.MyTipCalculatorTheme
import org.junit.Rule
import org.junit.Test

class TipUITests {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun calculate_20_percent_tip() {
        composeTestRule.setContent {
            MyTipCalculatorTheme {
                TipTimeScreen()
            }
        }
        composeTestRule
            .onNodeWithText("Cost of Service")
            .performTextInput("10")
//        composeTestRule
//            .onNodeWithText("Tip (%)")
//            .performTextInput("20")
        composeTestRule
            .onNodeWithText("Tip Amount: $1.50")
            .assertExists()
    }
}
