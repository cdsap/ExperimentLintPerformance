package com.performance.module_3_256

object Feature256Manager3 {
    private var instance: Feature256Manager3? = null

    fun getInstance(): Feature256Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature256Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
