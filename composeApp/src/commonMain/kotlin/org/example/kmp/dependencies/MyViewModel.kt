package org.example.kmp.dependencies

import androidx.lifecycle.ViewModel

class MyViewModel(private val repository: MyRepository) : ViewModel() {

    fun helloWorld(): String {
        return repository.helloWorld()
    }
}