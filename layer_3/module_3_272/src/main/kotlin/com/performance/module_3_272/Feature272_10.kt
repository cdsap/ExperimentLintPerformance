package com.performance.module_3_272

object Feature272Manager3 {
    private var instance: Feature272Manager3? = null

    fun getInstance(): Feature272Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature272Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
