package com.hey_viswa.todo.feature_note.presentation.add_edit_note

sealed class AddEditNoteEvent{
    data class EnteredTitle(val value: String): AddEditNoteEvent()
    data class ChangedTitleFocus(val value: String): AddEditNoteEvent()
    data class EnteredContent(val value: String): AddEditNoteEvent() // 1.47.58
}

