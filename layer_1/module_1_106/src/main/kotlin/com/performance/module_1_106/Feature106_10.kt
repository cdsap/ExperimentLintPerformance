package com.performance.module_1_106

object Feature106Manager3 {
    private var instance: Feature106Manager3? = null

    fun getInstance(): Feature106Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature106Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
