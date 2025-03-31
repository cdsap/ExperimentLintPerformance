package com.performance.module_0_36

object Feature36Manager3 {
    private var instance: Feature36Manager3? = null

    fun getInstance(): Feature36Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature36Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
