package com.performance.module_1_120

object Feature120Manager3 {
    private var instance: Feature120Manager3? = null

    fun getInstance(): Feature120Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature120Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
