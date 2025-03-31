package com.performance.module_0_6

object Feature6Manager3 {
    private var instance: Feature6Manager3? = null

    fun getInstance(): Feature6Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature6Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
