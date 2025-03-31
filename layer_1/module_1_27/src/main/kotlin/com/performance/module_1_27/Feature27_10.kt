package com.performance.module_1_27

object Feature27Manager3 {
    private var instance: Feature27Manager3? = null

    fun getInstance(): Feature27Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature27Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
