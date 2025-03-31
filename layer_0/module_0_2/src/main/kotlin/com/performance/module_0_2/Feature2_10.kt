package com.performance.module_0_2

object Feature2Manager3 {
    private var instance: Feature2Manager3? = null

    fun getInstance(): Feature2Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature2Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
