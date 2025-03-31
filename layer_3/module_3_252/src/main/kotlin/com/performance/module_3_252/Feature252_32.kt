package com.performance.module_3_252

class Feature252UseCase0(
    private val repository: Feature252Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
