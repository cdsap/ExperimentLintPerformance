package com.performance.module_2_141

object Feature141Manager3 {
    private var instance: Feature141Manager3? = null

    fun getInstance(): Feature141Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature141Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
