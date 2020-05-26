package com.example.demo.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Book(
        var bookName: String = "",
        var publisher: String = "",
        var price:String="",
        var number:String="",
        var description:String="",
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long = 0

)
