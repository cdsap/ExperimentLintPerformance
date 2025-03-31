package com.performance.module_0_26

object Feature26Manager3 {
    private var instance: Feature26Manager3? = null

    fun getInstance(): Feature26Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature26Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
