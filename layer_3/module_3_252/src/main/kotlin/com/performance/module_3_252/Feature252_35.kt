package com.performance.module_3_252

class Feature252UseCase1(
    private val repository: Feature252Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
