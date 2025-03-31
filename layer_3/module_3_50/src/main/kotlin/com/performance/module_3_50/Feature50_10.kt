package com.performance.module_3_50

object Feature50Manager3 {
    private var instance: Feature50Manager3? = null

    fun getInstance(): Feature50Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature50Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
