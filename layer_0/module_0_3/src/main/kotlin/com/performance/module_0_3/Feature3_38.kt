package com.performance.module_0_3

class Feature3UseCase2(
    private val repository: Feature3Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
