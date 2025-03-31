package com.performance.module_2_138

class Feature138UseCase2(
    private val repository: Feature138Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
