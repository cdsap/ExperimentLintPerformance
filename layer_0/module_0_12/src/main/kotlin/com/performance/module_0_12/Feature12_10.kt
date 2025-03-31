package com.performance.module_0_12

object Feature12Manager3 {
    private var instance: Feature12Manager3? = null

    fun getInstance(): Feature12Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature12Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
