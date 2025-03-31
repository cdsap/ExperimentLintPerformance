package com.performance.module_2_234

class Feature234UseCase1(
    private val repository: Feature234Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
