package com.performance.module_2_138

class Feature138UseCase1(
    private val repository: Feature138Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
