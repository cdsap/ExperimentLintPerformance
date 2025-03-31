package com.performance.module_0_123

object Feature123Manager3 {
    private var instance: Feature123Manager3? = null

    fun getInstance(): Feature123Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature123Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
