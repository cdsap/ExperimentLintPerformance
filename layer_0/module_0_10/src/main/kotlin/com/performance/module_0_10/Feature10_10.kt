package com.performance.module_0_10

object Feature10Manager3 {
    private var instance: Feature10Manager3? = null

    fun getInstance(): Feature10Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature10Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
