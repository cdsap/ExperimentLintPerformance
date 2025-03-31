package com.performance.module_4_198

object Feature198Manager3 {
    private var instance: Feature198Manager3? = null

    fun getInstance(): Feature198Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature198Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
