package com.performance.module_4_281

object Feature281Manager3 {
    private var instance: Feature281Manager3? = null

    fun getInstance(): Feature281Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature281Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
