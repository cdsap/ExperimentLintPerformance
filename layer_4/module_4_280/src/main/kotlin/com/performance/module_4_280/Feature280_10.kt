package com.performance.module_4_280

object Feature280Manager3 {
    private var instance: Feature280Manager3? = null

    fun getInstance(): Feature280Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature280Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
