package com.performance.module_0_4

class Feature4UseCase2(
    private val repository: Feature4Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
