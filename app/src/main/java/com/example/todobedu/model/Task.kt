package com.example.todobedu.model

class Task(name:String, completed: Boolean) {

    var name:String =""
    var completed:Boolean = false

    init {
        this.name = name
        this.completed = completed
    }

    fun isCompleted() : Boolean{
        return this.completed;
    }

    fun setCompleted(){
        this.completed = true
    }

}