package com.performance.module_2_213

object Feature213Manager3 {
    private var instance: Feature213Manager3? = null

    fun getInstance(): Feature213Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature213Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
