package com.performance.module_1_171

class Feature171UseCase1(
    private val repository: Feature171Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
