package com.performance.module_1_188

class Feature188UseCase0(
    private val repository: Feature188Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
