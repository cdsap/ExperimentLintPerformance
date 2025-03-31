package com.performance.module_0_17

object Feature17Manager3 {
    private var instance: Feature17Manager3? = null

    fun getInstance(): Feature17Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature17Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
