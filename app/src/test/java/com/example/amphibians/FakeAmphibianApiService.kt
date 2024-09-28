package com.example.amphibians

import com.example.amphibians.data.AmphibianApiService
import com.example.amphibians.model.Amphibian

class FakeAmphibianApiService :  AmphibianApiService{
    override suspend fun getAmphibians(): List<Amphibian> {
        return FakeDataSource.amphibiansList;
    }
}