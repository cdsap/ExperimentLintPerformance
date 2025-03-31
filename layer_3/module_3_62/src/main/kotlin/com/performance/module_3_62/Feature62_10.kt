package com.performance.module_3_62

object Feature62Manager3 {
    private var instance: Feature62Manager3? = null

    fun getInstance(): Feature62Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature62Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
