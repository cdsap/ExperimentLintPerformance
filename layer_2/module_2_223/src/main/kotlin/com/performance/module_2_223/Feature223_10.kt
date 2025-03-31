package com.performance.module_2_223

object Feature223Manager3 {
    private var instance: Feature223Manager3? = null

    fun getInstance(): Feature223Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature223Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
