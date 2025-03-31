package com.performance.module_3_261

object Feature261Manager3 {
    private var instance: Feature261Manager3? = null

    fun getInstance(): Feature261Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature261Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
