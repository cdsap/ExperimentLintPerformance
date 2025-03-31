package com.performance.module_1_23

object Feature23Manager3 {
    private var instance: Feature23Manager3? = null

    fun getInstance(): Feature23Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature23Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
