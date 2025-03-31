package com.performance.module_4_75

object Feature75Manager3 {
    private var instance: Feature75Manager3? = null

    fun getInstance(): Feature75Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature75Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
