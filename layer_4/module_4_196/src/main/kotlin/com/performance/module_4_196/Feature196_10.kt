package com.performance.module_4_196

object Feature196Manager3 {
    private var instance: Feature196Manager3? = null

    fun getInstance(): Feature196Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature196Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
