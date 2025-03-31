package com.performance.module_2_144

object Feature144Manager3 {
    private var instance: Feature144Manager3? = null

    fun getInstance(): Feature144Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature144Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
