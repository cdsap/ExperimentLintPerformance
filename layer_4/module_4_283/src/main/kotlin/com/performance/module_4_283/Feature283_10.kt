package com.performance.module_4_283

object Feature283Manager3 {
    private var instance: Feature283Manager3? = null

    fun getInstance(): Feature283Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature283Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
