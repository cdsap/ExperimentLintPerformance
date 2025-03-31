package com.performance.module_0_16

class Feature16UseCase1(
    private val repository: Feature16Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
