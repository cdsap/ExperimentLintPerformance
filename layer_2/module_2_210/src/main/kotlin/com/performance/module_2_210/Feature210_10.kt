package com.performance.module_2_210

object Feature210Manager3 {
    private var instance: Feature210Manager3? = null

    fun getInstance(): Feature210Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature210Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
