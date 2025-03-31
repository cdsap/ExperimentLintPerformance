package com.performance.module_3_252

class Feature252UseCase2(
    private val repository: Feature252Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
