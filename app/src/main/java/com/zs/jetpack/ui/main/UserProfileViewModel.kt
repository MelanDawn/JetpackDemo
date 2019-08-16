package com.zs.jetpack.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class UserProfileViewModel constructor(
    savedStateHandle: SavedStateHandle
) : ViewModel() {
    val userId : String = savedStateHandle["uid"] ?: throw IllegalArgumentException("missing user id")
    val user : LiveData<User> = UserRepository().getUser(userId)
}

class User : Any() {
    private val name : String = "shoe"
    private val age : Int = 25
}