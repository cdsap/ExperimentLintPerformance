package com.performance.module_1_95

class Feature95UseCase0(
    private val repository: Feature95Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
