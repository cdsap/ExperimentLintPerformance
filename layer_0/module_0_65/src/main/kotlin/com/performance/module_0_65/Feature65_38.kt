package com.performance.module_0_65

class Feature65UseCase2(
    private val repository: Feature65Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
