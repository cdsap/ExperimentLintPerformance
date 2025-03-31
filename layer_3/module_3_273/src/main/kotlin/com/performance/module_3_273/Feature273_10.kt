package com.performance.module_3_273

object Feature273Manager3 {
    private var instance: Feature273Manager3? = null

    fun getInstance(): Feature273Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature273Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
