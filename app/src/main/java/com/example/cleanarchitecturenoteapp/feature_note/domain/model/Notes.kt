package com.example.cleanarchitecturenoteapp.feature_note.domain.model

//need to add room and other dependencies

data class Notes(
    val title: String,
    val content: String,
    val timeStamp: Long,
    val color: Int
)
