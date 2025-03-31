package com.performance.module_5_301

object Feature301Manager3 {
    private var instance: Feature301Manager3? = null

    fun getInstance(): Feature301Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature301Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
