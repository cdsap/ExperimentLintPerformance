package com.performance.module_2_221

object Feature221Manager3 {
    private var instance: Feature221Manager3? = null

    fun getInstance(): Feature221Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature221Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
