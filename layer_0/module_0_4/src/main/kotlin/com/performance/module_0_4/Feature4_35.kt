package com.performance.module_0_4

class Feature4UseCase1(
    private val repository: Feature4Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
