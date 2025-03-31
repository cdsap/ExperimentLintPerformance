package com.performance.module_1_158

class Feature158UseCase1(
    private val repository: Feature158Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
