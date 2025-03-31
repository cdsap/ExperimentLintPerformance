package com.performance.module_1_30

class Feature30UseCase1(
    private val repository: Feature30Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
