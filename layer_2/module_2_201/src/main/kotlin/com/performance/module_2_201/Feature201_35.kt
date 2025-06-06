package com.performance.module_2_201

class Feature201UseCase1(
    private val repository: Feature201Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
