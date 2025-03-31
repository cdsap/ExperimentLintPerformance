package com.performance.module_4_298

object Feature298Manager3 {
    private var instance: Feature298Manager3? = null

    fun getInstance(): Feature298Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature298Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
