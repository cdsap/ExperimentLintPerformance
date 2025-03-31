package com.performance.module_3_172

object Feature172Manager3 {
    private var instance: Feature172Manager3? = null

    fun getInstance(): Feature172Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature172Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
