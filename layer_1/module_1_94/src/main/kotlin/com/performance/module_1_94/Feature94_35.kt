package com.performance.module_1_94

class Feature94UseCase1(
    private val repository: Feature94Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
