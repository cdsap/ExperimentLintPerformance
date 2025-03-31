package com.performance.module_0_103

class Feature103UseCase1(
    private val repository: Feature103Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
