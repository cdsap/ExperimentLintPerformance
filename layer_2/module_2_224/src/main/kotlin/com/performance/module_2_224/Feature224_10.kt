package com.performance.module_2_224

object Feature224Manager3 {
    private var instance: Feature224Manager3? = null

    fun getInstance(): Feature224Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature224Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
