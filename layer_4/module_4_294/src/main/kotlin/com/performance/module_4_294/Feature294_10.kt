package com.performance.module_4_294

object Feature294Manager3 {
    private var instance: Feature294Manager3? = null

    fun getInstance(): Feature294Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature294Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
