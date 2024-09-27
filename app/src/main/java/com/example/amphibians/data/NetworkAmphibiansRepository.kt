package com.example.amphibians.data

import com.example.amphibians.model.Amphibian

interface AmphibiansRepository {
    suspend fun getAmphibiansData(): List<Amphibian>
}


class NetworkAmphibiansRepository(private  val amphibianApiService: AmphibianApiService) : AmphibiansRepository{
    override suspend fun getAmphibiansData()= amphibianApiService.getAmphibians()
}