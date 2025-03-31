package com.performance.module_1_94

class Feature94UseCase0(
    private val repository: Feature94Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
