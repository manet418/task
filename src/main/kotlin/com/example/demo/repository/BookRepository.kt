package com.example.demo.repository

import com.example.demo.domain.Book
import org.springframework.data.repository.CrudRepository

interface BookRepository : CrudRepository<Book , Long>
{
    fun findByBookName(name : String) : List<Book>
}