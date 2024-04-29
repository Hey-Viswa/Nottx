package com.hey_viswa.todo.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.hey_viswa.todo.ui.theme.BabyBlue
import com.hey_viswa.todo.ui.theme.CreamOrange
import com.hey_viswa.todo.ui.theme.CreamPistashio
import com.hey_viswa.todo.ui.theme.LightGreen
import com.hey_viswa.todo.ui.theme.Pistas
import com.hey_viswa.todo.ui.theme.Purple
import com.hey_viswa.todo.ui.theme.RedOrange
import com.hey_viswa.todo.ui.theme.RedPink
import com.hey_viswa.todo.ui.theme.Turnip
import com.hey_viswa.todo.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timeStamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColor = listOf(
            RedOrange, RedPink, BabyBlue, Violet, LightGreen, Purple, Turnip,
            CreamPistashio, Pistas, CreamOrange
        )
    }
}
