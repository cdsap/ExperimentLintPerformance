package com.performance.module_2_143

class Feature143UseCase1(
    private val repository: Feature143Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
