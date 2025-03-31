package com.performance.module_0_10

class Feature10UseCase0(
    private val repository: Feature10Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
