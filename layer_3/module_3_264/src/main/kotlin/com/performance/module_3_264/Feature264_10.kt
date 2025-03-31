package com.performance.module_3_264

object Feature264Manager3 {
    private var instance: Feature264Manager3? = null

    fun getInstance(): Feature264Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature264Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
