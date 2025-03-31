package com.performance.module_2_234

class Feature234UseCase2(
    private val repository: Feature234Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
