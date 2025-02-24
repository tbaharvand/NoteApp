package com.example.cleanarchitecturenoteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.cleanarchitecturenoteapp.ui.BabyBlue
import com.example.cleanarchitecturenoteapp.ui.LightGreen
import com.example.cleanarchitecturenoteapp.ui.RedOrange
import com.example.cleanarchitecturenoteapp.ui.RedPink
import com.example.cleanarchitecturenoteapp.ui.Violet

//need to add room and other dependencies
@Entity
data class Notes(
    val title: String,
    val content: String,
    val timeStamp: Long,
    val color: Int,
    @PrimaryKey val id: Int?=null
){
    companion object{
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}
