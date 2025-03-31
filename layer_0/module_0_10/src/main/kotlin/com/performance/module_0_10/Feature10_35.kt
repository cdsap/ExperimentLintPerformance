package com.performance.module_0_10

class Feature10UseCase1(
    private val repository: Feature10Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
