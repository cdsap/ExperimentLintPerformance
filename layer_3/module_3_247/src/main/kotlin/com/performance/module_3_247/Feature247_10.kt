package com.performance.module_3_247

object Feature247Manager3 {
    private var instance: Feature247Manager3? = null

    fun getInstance(): Feature247Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature247Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
