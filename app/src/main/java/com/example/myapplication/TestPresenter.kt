package com.example.myapplication

class TestPresenter (private val class1: Class1, private val class2: Class2) {
    fun text() : String {
        return class1.abc() + class2.abc()
    }
}