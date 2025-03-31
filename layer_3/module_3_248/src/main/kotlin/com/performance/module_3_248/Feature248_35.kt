package com.performance.module_3_248

class Feature248UseCase1(
    private val repository: Feature248Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
