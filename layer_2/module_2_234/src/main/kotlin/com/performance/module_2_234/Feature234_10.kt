package com.performance.module_2_234

object Feature234Manager3 {
    private var instance: Feature234Manager3? = null

    fun getInstance(): Feature234Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature234Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
