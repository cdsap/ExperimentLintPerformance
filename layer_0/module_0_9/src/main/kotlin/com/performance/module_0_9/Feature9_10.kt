package com.performance.module_0_9

object Feature9Manager3 {
    private var instance: Feature9Manager3? = null

    fun getInstance(): Feature9Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature9Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
