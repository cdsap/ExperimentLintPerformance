package com.performance.module_1_100

object Feature100Manager3 {
    private var instance: Feature100Manager3? = null

    fun getInstance(): Feature100Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature100Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
