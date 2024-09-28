package com.example.amphibians

import com.example.amphibians.data.NetworkAmphibiansRepository
import kotlinx.coroutines.test.runTest
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class NetworkAmphibiansRepositoryTest {

    @Test
    fun networkAmphibiansRepository_getAmphibians_verifyAmphibiansList() = runTest {  val repository = NetworkAmphibiansRepository(
        amphibianApiService = FakeAmphibianApiService()
    )
        assertEquals(FakeDataSource.amphibiansList, repository.getAmphibiansData())}

}