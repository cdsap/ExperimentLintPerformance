package com.performance.module_4_288

object Feature288Manager3 {
    private var instance: Feature288Manager3? = null

    fun getInstance(): Feature288Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature288Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
