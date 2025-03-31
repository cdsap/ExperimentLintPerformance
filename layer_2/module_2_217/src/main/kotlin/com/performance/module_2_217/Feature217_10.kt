package com.performance.module_2_217

object Feature217Manager3 {
    private var instance: Feature217Manager3? = null

    fun getInstance(): Feature217Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature217Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
