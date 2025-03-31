package com.performance.module_0_103

object Feature103Manager3 {
    private var instance: Feature103Manager3? = null

    fun getInstance(): Feature103Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature103Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
