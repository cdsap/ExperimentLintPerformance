package com.performance.module_4_278

object Feature278Manager3 {
    private var instance: Feature278Manager3? = null

    fun getInstance(): Feature278Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature278Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
