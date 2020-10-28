package com.example.todobedu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.todobedu.custom.TaskManager
import com.example.todobedu.model.Task

class MainActivity : AppCompatActivity() {

    var items: ArrayList<Task> = ArrayList()
    var adapter: TaskManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dummyTask()
        initComponents()
    }

    fun initComponents() {
        var taskList = findViewById<RecyclerView>(R.id.taskList)
        taskList.setHasFixedSize(true)
        this.adapter= TaskManager(this,items)
        taskList.adapter = this.adapter
    }

    fun dummyTask(){
        this.items.add(Task("Pister",false))
        this.items.add(Task("Programar",false))
        this.items.add(Task("Listado",false))
    }
}