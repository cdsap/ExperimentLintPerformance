package com.performance.module_3_51

object Feature51Manager3 {
    private var instance: Feature51Manager3? = null

    fun getInstance(): Feature51Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature51Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
