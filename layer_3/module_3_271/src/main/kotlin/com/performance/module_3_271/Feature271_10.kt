package com.performance.module_3_271

object Feature271Manager3 {
    private var instance: Feature271Manager3? = null

    fun getInstance(): Feature271Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature271Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
