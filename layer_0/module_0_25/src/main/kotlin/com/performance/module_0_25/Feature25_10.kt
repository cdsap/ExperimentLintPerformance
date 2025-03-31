package com.performance.module_0_25

object Feature25Manager3 {
    private var instance: Feature25Manager3? = null

    fun getInstance(): Feature25Manager3 {
        return instance ?: synchronized(this) {
            instance ?: Feature25Manager3.also { instance = it }
        }
    }

    fun process(data: Any): Any = data
    fun validate(input: String): Boolean = input.isNotEmpty()
}
