package com.performance.module_1_180

object Feature180Manager3 {
    private var instance: Feature180Manager3? = null

    fun getInstance(): Feature180Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature180Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
