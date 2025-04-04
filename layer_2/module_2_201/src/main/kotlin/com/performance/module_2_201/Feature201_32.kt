package com.performance.module_2_201

class Feature201UseCase0(
    private val repository: Feature201Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
