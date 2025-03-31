package com.performance.module_2_233

object Feature233Manager3 {
    private var instance: Feature233Manager3? = null

    fun getInstance(): Feature233Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature233Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
