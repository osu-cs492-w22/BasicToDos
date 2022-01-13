package com.example.android.basictodos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val todoListTV = findViewById<TextView>(R.id.tv_todo_list)
        val todoEntryET = findViewById<EditText>(R.id.et_todo_entry)
        val addToDoBtn = findViewById<Button>(R.id.btn_add_todo)

        val toDoList = mutableListOf<String>()

        addToDoBtn.setOnClickListener {
            val newTodo = todoEntryET.text.toString()
            if (!TextUtils.isEmpty(newTodo)) {
                toDoList.add(0, newTodo)
                todoListTV.text = toDoList.joinToString(separator = "\n\n☐  ", prefix = "☐  ")
                todoEntryET.setText("")
            }
        }
    }
}