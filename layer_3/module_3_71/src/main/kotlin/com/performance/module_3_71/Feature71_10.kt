package com.performance.module_3_71

object Feature71Manager3 {
    private var instance: Feature71Manager3? = null

    fun getInstance(): Feature71Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature71Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
