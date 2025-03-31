package com.performance.module_0_22

object Feature22Manager3 {
    private var instance: Feature22Manager3? = null

    fun getInstance(): Feature22Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature22Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
