package com.performance.module_3_266

object Feature266Manager3 {
    private var instance: Feature266Manager3? = null

    fun getInstance(): Feature266Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature266Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
