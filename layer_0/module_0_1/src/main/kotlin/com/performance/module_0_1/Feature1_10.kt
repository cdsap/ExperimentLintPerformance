package com.performance.module_0_1

object Feature1Manager3 {
    private var instance: Feature1Manager3? = null

    fun getInstance(): Feature1Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature1Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
