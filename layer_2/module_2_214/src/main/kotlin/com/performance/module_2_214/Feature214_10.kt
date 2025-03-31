package com.performance.module_2_214

object Feature214Manager3 {
    private var instance: Feature214Manager3? = null

    fun getInstance(): Feature214Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature214Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
