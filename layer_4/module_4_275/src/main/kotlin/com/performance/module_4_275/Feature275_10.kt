package com.performance.module_4_275

object Feature275Manager3 {
    private var instance: Feature275Manager3? = null

    fun getInstance(): Feature275Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature275Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
