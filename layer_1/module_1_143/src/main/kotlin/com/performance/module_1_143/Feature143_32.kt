package com.performance.module_1_143

class Feature143UseCase0(
    private val repository: Feature143Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
