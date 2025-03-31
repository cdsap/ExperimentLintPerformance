package com.performance.module_2_226

object Feature226Manager3 {
    private var instance: Feature226Manager3? = null

    fun getInstance(): Feature226Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature226Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
