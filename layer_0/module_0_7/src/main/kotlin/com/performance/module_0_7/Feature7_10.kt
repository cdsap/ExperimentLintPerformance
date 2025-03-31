package com.performance.module_0_7

object Feature7Manager3 {
    private var instance: Feature7Manager3? = null

    fun getInstance(): Feature7Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature7Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
