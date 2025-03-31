package com.performance.module_4_297

object Feature297Manager3 {
    private var instance: Feature297Manager3? = null

    fun getInstance(): Feature297Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature297Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
