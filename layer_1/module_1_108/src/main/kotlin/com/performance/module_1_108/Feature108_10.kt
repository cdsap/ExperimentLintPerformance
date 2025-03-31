package com.performance.module_1_108

object Feature108Manager3 {
    private var instance: Feature108Manager3? = null

    fun getInstance(): Feature108Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature108Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
