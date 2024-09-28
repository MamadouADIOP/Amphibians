package com.example.amphibians

import com.example.amphibians.data.AmphibiansRepository
import com.example.amphibians.model.Amphibian

class FakeNetworkAmphibiansRepository : AmphibiansRepository {
    override suspend fun getAmphibiansData(): List<Amphibian> {
        return FakeDataSource.amphibiansList;
    }
}