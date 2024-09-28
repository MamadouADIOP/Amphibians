package com.example.amphibians

import com.example.amphibians.model.Amphibian

object FakeDataSource {
    val amphibiansList = listOf(
        Amphibian(
           name = "amph1",
            description = "desc1",
            type = "type1",
            imgSrc = "imgSrc1"
        ),
        Amphibian(
            name = "amph2",
            description = "desc2",
            type = "type2",
            imgSrc = "imgSrc2"
        ),
        Amphibian(
            name = "amph3",
            description = "desc3",
            type = "type3",
            imgSrc = "imgSrc3"
        ),
    )
}