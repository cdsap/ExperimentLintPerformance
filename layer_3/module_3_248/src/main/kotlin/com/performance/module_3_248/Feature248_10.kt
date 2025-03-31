package com.performance.module_3_248

object Feature248Manager3 {
    private var instance: Feature248Manager3? = null

    fun getInstance(): Feature248Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature248Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
