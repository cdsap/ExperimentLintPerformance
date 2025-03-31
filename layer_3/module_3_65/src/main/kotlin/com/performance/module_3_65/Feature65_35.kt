package com.performance.module_3_65

class Feature65UseCase1(
    private val repository: Feature65Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
