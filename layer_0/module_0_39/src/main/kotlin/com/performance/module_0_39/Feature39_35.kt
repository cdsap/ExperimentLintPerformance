package com.performance.module_0_39

class Feature39UseCase1(
    private val repository: Feature39Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
