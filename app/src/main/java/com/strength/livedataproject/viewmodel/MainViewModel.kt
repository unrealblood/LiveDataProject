package com.strength.livedataproject.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var factsLiveData = MutableLiveData<String>("This is a fact.")

    fun updateLiveData() {
        factsLiveData.value = "This data has been updated."
    }
}