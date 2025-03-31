package com.performance.module_2_202

object Feature202Manager3 {
    private var instance: Feature202Manager3? = null

    fun getInstance(): Feature202Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature202Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
