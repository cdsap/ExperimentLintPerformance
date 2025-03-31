package com.performance.module_4_277

object Feature277Manager3 {
    private var instance: Feature277Manager3? = null

    fun getInstance(): Feature277Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature277Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
