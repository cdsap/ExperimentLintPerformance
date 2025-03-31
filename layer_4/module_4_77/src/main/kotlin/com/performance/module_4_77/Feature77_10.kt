package com.performance.module_4_77

object Feature77Manager3 {
    private var instance: Feature77Manager3? = null

    fun getInstance(): Feature77Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature77Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
