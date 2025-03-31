package com.performance.module_1_188

class Feature188UseCase2(
    private val repository: Feature188Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
