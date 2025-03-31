package com.performance.module_0_15

object Feature15Manager3 {
    private var instance: Feature15Manager3? = null

    fun getInstance(): Feature15Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature15Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
