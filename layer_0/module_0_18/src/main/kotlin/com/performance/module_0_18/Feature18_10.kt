package com.performance.module_0_18

object Feature18Manager3 {
    private var instance: Feature18Manager3? = null

    fun getInstance(): Feature18Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature18Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
