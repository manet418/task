package com.example.demo.component

import com.example.demo.domain.Book
import com.example.demo.repository.BookRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class StartHere
{
    @Autowired
    lateinit var repository: BookRepository
    fun insertData()
    {
        repository.save(Book("javaSE","Oracle","20000","12","for begginers"))
    }
    fun selectData()
    {
        var books=repository.findAll()
        for (item in books)
        {
            println(item.bookName)
        }
    }
    fun selectByName(name:String)
    {
        var books=repository.findByBookName(name)
       for(i in books)
       {
           println("bookName is : ${i.bookName} , bookPrice is : ${i.price} , bookPublisher is : ${i.publisher}")
       }
    }
}