package com.performance.module_1_165

class Feature165UseCase1(
    private val repository: Feature165Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
