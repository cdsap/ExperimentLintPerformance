package com.performance.module_4_300

object Feature300Manager3 {
    private var instance: Feature300Manager3? = null

    fun getInstance(): Feature300Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature300Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
