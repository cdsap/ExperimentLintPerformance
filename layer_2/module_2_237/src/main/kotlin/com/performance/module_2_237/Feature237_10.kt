package com.performance.module_2_237

object Feature237Manager3 {
    private var instance: Feature237Manager3? = null

    fun getInstance(): Feature237Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature237Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
