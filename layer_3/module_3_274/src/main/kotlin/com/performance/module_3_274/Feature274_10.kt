package com.performance.module_3_274

object Feature274Manager3 {
    private var instance: Feature274Manager3? = null

    fun getInstance(): Feature274Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature274Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
