package com.example.kasihreview.Model

data class MovieGoer(
    var user_id: Int,
    var username: String,
    var bio: String,
    var full_name: String,
    var password_hash: String,
    var salt: String,
    var avatar_url: String
)