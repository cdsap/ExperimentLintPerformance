package com.performance.module_1_101

object Feature101Manager3 {
    private var instance: Feature101Manager3? = null

    fun getInstance(): Feature101Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature101Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
