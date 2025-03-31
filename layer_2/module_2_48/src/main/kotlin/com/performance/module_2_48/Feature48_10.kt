package com.performance.module_2_48

object Feature48Manager3 {
    private var instance: Feature48Manager3? = null

    fun getInstance(): Feature48Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature48Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
