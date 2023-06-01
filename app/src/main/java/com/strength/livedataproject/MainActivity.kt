package com.strength.livedataproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.strength.livedataproject.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var mainViewModel: MainViewModel

    private lateinit var mainTextView : TextView
    private lateinit var updateTextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(this@MainActivity).get(MainViewModel::class.java)

        mainTextView = findViewById(R.id.main_text_view_MA)
        updateTextButton = findViewById(R.id.update_text_button_MA)

        mainViewModel.factsLiveData.observe(this@MainActivity, Observer {
            mainTextView.text = it
        })

        updateTextButton.setOnClickListener { mainViewModel.updateLiveData() }
    }
}