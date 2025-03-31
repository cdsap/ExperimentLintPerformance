package com.performance.module_2_241

object Feature241Manager3 {
    private var instance: Feature241Manager3? = null

    fun getInstance(): Feature241Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature241Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
