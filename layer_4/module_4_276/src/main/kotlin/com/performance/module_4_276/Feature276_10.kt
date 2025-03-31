package com.performance.module_4_276

object Feature276Manager3 {
    private var instance: Feature276Manager3? = null

    fun getInstance(): Feature276Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature276Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
