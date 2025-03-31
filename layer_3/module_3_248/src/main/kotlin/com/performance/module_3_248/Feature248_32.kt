package com.performance.module_3_248

class Feature248UseCase0(
    private val repository: Feature248Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
