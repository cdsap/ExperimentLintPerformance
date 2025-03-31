package com.performance.module_4_286

object Feature286Manager3 {
    private var instance: Feature286Manager3? = null

    fun getInstance(): Feature286Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature286Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
