package com.performance.module_5_201

class Feature201UseCase2(
    private val repository: Feature201Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
