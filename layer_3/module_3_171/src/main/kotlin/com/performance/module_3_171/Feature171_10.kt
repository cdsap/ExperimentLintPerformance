package com.performance.module_3_171

object Feature171Manager3 {
    private var instance: Feature171Manager3? = null

    fun getInstance(): Feature171Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature171Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
