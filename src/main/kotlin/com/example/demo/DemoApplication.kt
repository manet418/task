package com.example.demo


import com.example.demo.component.StartHere
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class DemoApplication




fun main(args: Array<String>) {
//	runApplication<DemoApplication>(*args)
	var context= runApplication<DemoApplication>(*args)
	var start=context.getBean(StartHere::class.java)
	//start.insertData()
	//start.selectData()
	start.selectByName("javaSE")
//	SpringApplication.run(DemoApplication::class.java, *args)

}
