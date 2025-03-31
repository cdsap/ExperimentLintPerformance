package com.performance.module_2_146

object Feature146Manager3 {
    private var instance: Feature146Manager3? = null

    fun getInstance(): Feature146Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature146Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
