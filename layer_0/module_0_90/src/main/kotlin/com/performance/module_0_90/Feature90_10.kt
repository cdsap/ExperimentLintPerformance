package com.performance.module_0_90

object Feature90Manager3 {
    private var instance: Feature90Manager3? = null

    fun getInstance(): Feature90Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature90Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
