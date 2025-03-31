package com.performance.module_2_234

class Feature234UseCase0(
    private val repository: Feature234Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
