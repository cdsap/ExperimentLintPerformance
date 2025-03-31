package com.performance.module_1_94

class Feature94UseCase2(
    private val repository: Feature94Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
