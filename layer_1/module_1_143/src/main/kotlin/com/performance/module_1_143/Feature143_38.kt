package com.performance.module_1_143

class Feature143UseCase2(
    private val repository: Feature143Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
