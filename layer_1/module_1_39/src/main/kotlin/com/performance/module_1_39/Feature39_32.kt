package com.performance.module_1_39

class Feature39UseCase0(
    private val repository: Feature39Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
