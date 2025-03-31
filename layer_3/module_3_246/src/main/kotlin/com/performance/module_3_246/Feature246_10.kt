package com.performance.module_3_246

object Feature246Manager3 {
    private var instance: Feature246Manager3? = null

    fun getInstance(): Feature246Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature246Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
