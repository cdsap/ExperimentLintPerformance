package com.performance.module_3_270

object Feature270Manager3 {
    private var instance: Feature270Manager3? = null

    fun getInstance(): Feature270Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature270Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
