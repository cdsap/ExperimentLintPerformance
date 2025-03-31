package com.performance.module_3_248

class Feature248UseCase2(
    private val repository: Feature248Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
