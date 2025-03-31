package com.performance.module_1_95

class Feature95UseCase2(
    private val repository: Feature95Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
