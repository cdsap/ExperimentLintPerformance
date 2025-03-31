package com.performance.module_4_284

object Feature284Manager3 {
    private var instance: Feature284Manager3? = null

    fun getInstance(): Feature284Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature284Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
