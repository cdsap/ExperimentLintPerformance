package com.performance.module_4_295

object Feature295Manager3 {
    private var instance: Feature295Manager3? = null

    fun getInstance(): Feature295Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature295Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
