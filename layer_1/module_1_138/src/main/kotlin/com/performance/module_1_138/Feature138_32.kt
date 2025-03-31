package com.performance.module_1_138

class Feature138UseCase0(
    private val repository: Feature138Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
