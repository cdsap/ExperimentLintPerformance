package com.performance.module_0_94

class Feature94UseCase2(
    private val repository: Feature94Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
