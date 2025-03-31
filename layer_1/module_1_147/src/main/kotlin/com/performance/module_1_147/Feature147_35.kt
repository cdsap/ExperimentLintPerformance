package com.performance.module_1_147

class Feature147UseCase1(
    private val repository: Feature147Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
