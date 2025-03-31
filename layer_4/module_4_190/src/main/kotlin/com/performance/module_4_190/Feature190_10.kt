package com.performance.module_4_190

object Feature190Manager3 {
    private var instance: Feature190Manager3? = null

    fun getInstance(): Feature190Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature190Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
