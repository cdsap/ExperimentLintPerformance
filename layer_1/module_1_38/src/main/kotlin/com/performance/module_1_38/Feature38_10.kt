package com.performance.module_1_38

object Feature38Manager3 {
    private var instance: Feature38Manager3? = null

    fun getInstance(): Feature38Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature38Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
