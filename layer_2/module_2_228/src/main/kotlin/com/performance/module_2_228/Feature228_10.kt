package com.performance.module_2_228

object Feature228Manager3 {
    private var instance: Feature228Manager3? = null

    fun getInstance(): Feature228Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature228Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
