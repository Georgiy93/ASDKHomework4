package ru.netology.homework4.dto

data class Post(
    val id: Long,
    val author: String,
    val content: String,
    val published: String,
    var like: Long = 0,
    var share: Long = 0,
    var view:Long = 0,
    var likedByMe: Boolean = false,
    var sharedByMe: Boolean = false,
    var viewedByMe: Boolean = false
)