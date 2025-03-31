package com.performance.module_2_222

object Feature222Manager3 {
    private var instance: Feature222Manager3? = null

    fun getInstance(): Feature222Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature222Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
