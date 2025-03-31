package com.performance.module_1_16

object Feature16Manager3 {
    private var instance: Feature16Manager3? = null

    fun getInstance(): Feature16Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature16Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
