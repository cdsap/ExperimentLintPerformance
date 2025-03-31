package com.performance.module_3_251

object Feature251Manager3 {
    private var instance: Feature251Manager3? = null

    fun getInstance(): Feature251Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature251Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
