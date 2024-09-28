package com.example.amphibians

import com.example.amphibians.rules.TestDispatcherRule
import com.example.amphibians.ui.AmphibiansUiState
import com.example.amphibians.ui.AmphibiansViewModel
import kotlinx.coroutines.test.runTest
import org.junit.Rule
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class AmphibiansViewModelTest  {
    @get:Rule
    val testDispatcher = TestDispatcherRule()

    @Test
    fun networkAmphibiansRepository_getAmphibians_verifyAmphibiansList()  =
        runTest{
            val amphibiansViewModel = AmphibiansViewModel(
                amphibiansRepository = FakeNetworkAmphibiansRepository()
            )
            assertEquals(
                AmphibiansUiState.Success(FakeDataSource.amphibiansList),
                amphibiansViewModel.amphibiansUiState
            )
        }
}