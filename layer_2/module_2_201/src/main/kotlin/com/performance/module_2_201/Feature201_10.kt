package com.performance.module_2_201

object Feature201Manager3 {
    private var instance: Feature201Manager3? = null

    fun getInstance(): Feature201Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature201Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
