package com.performance.module_2_220

object Feature220Manager3 {
    private var instance: Feature220Manager3? = null

    fun getInstance(): Feature220Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature220Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
