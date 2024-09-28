package com.example.amphibians

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.junit4.createComposeRule
import com.example.amphibians.ui.AmphibiansApp
import com.example.amphibians.ui.theme.AmphibiansTheme
import org.junit.Rule
import org.junit.Test

class AmphibiansUiTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun calculate_20_percent_tip() {
        composeTestRule.setContent {
            AmphibiansTheme {
                Surface (modifier = Modifier.fillMaxSize()){
                    AmphibiansApp()
                }
            }
        }
//        composeTestRule.onNodeWithText("Bill Amount").performTextInput("10")
//        composeTestRule.onNodeWithText("Tip Percentage").performTextInput("20")
//        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
//        composeTestRule.onNodeWithText("Tip Amount: $expectedTip").assertExists(
//            "No node with this text was found."
//        )
    }
}