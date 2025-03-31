package com.performance.module_0_14

object Feature14Manager3 {
    private var instance: Feature14Manager3? = null

    fun getInstance(): Feature14Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature14Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
