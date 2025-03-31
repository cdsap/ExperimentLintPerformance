package com.performance.module_2_133

object Feature133Manager3 {
    private var instance: Feature133Manager3? = null

    fun getInstance(): Feature133Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature133Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
