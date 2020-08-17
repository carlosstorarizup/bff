package com.example.bff.dataClass

data class RequestCredentials(
        val username: String,
        val password: String,
        val authType: String
)