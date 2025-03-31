package com.performance.module_1_16

class Feature16UseCase0(
    private val repository: Feature16Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
