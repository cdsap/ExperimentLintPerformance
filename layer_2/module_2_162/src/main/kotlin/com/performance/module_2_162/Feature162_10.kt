package com.performance.module_2_162

object Feature162Manager3 {
    private var instance: Feature162Manager3? = null

    fun getInstance(): Feature162Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature162Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
