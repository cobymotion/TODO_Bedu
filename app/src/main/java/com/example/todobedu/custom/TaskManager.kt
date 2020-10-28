package com.example.todobedu.custom

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.todobedu.R
import com.example.todobedu.model.Task
import com.google.android.material.checkbox.MaterialCheckBox
import java.security.AccessControlContext

class TaskManager (var context: Context
                   , task: ArrayList<Task>) : RecyclerView.Adapter<TaskManager.ViewHolder>() {

    var item: ArrayList<Task>? = null

    init {
        this.item = task
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var taskItemView = LayoutInflater.from(parent.context).inflate(R.layout.task_item,parent,false)
        return ViewHolder(taskItemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var currentItem = this.item?.get(position)
        holder.checkBox?.isChecked = currentItem?.isCompleted()!!
        holder.textView?.text = currentItem?.name
    }

    override fun getItemCount(): Int = item?.size!!



    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        var checkBox: MaterialCheckBox? = null
        var textView: TextView? = null

        init {
            this.checkBox = itemView.findViewById(R.id.checked)
            this.textView = itemView.findViewById(R.id.task_name)
        }

    }

}