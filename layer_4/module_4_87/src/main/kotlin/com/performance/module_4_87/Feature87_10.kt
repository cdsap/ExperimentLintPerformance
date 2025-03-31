package com.performance.module_4_87

object Feature87Manager3 {
    private var instance: Feature87Manager3? = null

    fun getInstance(): Feature87Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature87Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
