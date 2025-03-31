package com.performance.module_4_76

object Feature76Manager3 {
    private var instance: Feature76Manager3? = null

    fun getInstance(): Feature76Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature76Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
