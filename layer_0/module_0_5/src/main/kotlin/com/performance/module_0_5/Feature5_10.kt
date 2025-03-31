package com.performance.module_0_5

object Feature5Manager3 {
    private var instance: Feature5Manager3? = null

    fun getInstance(): Feature5Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature5Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
