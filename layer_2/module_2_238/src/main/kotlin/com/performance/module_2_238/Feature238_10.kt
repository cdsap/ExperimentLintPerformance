package com.performance.module_2_238

object Feature238Manager3 {
    private var instance: Feature238Manager3? = null

    fun getInstance(): Feature238Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature238Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
