package com.performance.module_1_16

class Feature16UseCase2(
    private val repository: Feature16Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
