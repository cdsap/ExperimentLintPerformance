package com.performance.module_4_290

object Feature290Manager3 {
    private var instance: Feature290Manager3? = null

    fun getInstance(): Feature290Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature290Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
