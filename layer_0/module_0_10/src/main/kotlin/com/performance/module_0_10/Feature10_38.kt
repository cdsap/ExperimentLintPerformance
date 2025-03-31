package com.performance.module_0_10

class Feature10UseCase2(
    private val repository: Feature10Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
