package com.performance.module_3_252

object Feature252Manager3 {
    private var instance: Feature252Manager3? = null

    fun getInstance(): Feature252Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature252Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
