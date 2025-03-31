package com.performance.module_1_102

object Feature102Manager3 {
    private var instance: Feature102Manager3? = null

    fun getInstance(): Feature102Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature102Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
