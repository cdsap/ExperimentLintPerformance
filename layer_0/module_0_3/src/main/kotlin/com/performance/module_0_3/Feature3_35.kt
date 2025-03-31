package com.performance.module_0_3

class Feature3UseCase1(
    private val repository: Feature3Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
