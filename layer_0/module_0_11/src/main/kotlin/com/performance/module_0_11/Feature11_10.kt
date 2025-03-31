package com.performance.module_0_11

object Feature11Manager3 {
    private var instance: Feature11Manager3? = null

    fun getInstance(): Feature11Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature11Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
