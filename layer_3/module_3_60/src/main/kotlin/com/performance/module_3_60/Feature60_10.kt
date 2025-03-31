package com.performance.module_3_60

object Feature60Manager3 {
    private var instance: Feature60Manager3? = null

    fun getInstance(): Feature60Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature60Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
