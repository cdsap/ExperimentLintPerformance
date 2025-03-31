package com.performance.module_2_211

object Feature211Manager3 {
    private var instance: Feature211Manager3? = null

    fun getInstance(): Feature211Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature211Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
