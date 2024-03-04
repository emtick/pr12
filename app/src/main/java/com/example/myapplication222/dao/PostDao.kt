package com.example.myapplication222.dao
import com.example.myapplication222.Post
interface PostDao {
    interface PostDao {
        fun getAll(): List<Post>
        fun save(post: Post): Post
        fun likeById(id: Long)
        fun removeById(id: Long)
    }
}