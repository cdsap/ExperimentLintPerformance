package com.performance.module_1_95

class Feature95UseCase1(
    private val repository: Feature95Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
