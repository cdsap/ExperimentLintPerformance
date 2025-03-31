package com.performance.module_2_236

object Feature236Manager3 {
    private var instance: Feature236Manager3? = null

    fun getInstance(): Feature236Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature236Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
