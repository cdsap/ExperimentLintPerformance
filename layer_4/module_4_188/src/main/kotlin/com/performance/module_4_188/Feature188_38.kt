package com.performance.module_4_188

class Feature188UseCase2(
    private val repository: Feature188Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
