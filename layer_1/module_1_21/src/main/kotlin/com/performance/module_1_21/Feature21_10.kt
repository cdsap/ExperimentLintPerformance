package com.performance.module_1_21

object Feature21Manager3 {
    private var instance: Feature21Manager3? = null

    fun getInstance(): Feature21Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature21Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
