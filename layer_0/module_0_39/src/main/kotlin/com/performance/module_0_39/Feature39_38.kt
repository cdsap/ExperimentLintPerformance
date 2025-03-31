package com.performance.module_0_39

class Feature39UseCase2(
    private val repository: Feature39Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
