package com.example.entities

@kotlinx.serialization.Serializable
data class User(
    val id: Int,
    val email: String,
    val userName: String,
    val password: String
)
