package com.performance.module_4_287

object Feature287Manager3 {
    private var instance: Feature287Manager3? = null

    fun getInstance(): Feature287Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature287Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
