package com.performance.module_4_293

object Feature293Manager3 {
    private var instance: Feature293Manager3? = null

    fun getInstance(): Feature293Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature293Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
