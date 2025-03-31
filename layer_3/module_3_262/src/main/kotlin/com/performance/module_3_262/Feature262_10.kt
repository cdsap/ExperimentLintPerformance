package com.performance.module_3_262

object Feature262Manager3 {
    private var instance: Feature262Manager3? = null

    fun getInstance(): Feature262Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature262Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
