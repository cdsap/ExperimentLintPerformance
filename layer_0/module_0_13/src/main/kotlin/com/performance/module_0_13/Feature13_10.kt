package com.performance.module_0_13

object Feature13Manager3 {
    private var instance: Feature13Manager3? = null

    fun getInstance(): Feature13Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature13Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
