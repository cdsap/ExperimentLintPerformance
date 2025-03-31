package com.performance.module_4_80

object Feature80Manager3 {
    private var instance: Feature80Manager3? = null

    fun getInstance(): Feature80Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature80Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
