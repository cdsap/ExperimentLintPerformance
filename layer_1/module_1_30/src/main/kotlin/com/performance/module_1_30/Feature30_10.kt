package com.performance.module_1_30

object Feature30Manager3 {
    private var instance: Feature30Manager3? = null

    fun getInstance(): Feature30Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature30Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
