package com.performance.module_0_4

object Feature4Manager3 {
    private var instance: Feature4Manager3? = null

    fun getInstance(): Feature4Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature4Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
