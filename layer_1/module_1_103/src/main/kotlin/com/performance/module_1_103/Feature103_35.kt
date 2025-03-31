package com.performance.module_1_103

class Feature103UseCase1(
    private val repository: Feature103Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
