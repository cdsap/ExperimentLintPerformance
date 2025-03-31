package com.performance.module_2_203

object Feature203Manager3 {
    private var instance: Feature203Manager3? = null

    fun getInstance(): Feature203Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature203Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
