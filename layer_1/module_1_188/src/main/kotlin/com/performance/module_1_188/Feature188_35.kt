package com.performance.module_1_188

class Feature188UseCase1(
    private val repository: Feature188Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
