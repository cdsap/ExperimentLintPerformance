package com.performance.module_4_296

object Feature296Manager3 {
    private var instance: Feature296Manager3? = null

    fun getInstance(): Feature296Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature296Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
