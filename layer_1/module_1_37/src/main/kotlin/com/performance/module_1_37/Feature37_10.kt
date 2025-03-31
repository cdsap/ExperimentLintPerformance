package com.performance.module_1_37

object Feature37Manager3 {
    private var instance: Feature37Manager3? = null

    fun getInstance(): Feature37Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature37Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
