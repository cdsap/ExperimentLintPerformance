package com.performance.module_0_95

class Feature95UseCase2(
    private val repository: Feature95Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
