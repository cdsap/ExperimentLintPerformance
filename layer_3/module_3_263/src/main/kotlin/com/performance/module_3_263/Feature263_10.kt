package com.performance.module_3_263

object Feature263Manager3 {
    private var instance: Feature263Manager3? = null

    fun getInstance(): Feature263Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature263Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
