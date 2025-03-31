package com.performance.module_0_3

class Feature3UseCase0(
    private val repository: Feature3Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
