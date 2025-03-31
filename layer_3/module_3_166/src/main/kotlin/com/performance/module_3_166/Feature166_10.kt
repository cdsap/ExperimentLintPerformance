package com.performance.module_3_166

object Feature166Manager3 {
    private var instance: Feature166Manager3? = null

    fun getInstance(): Feature166Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature166Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
