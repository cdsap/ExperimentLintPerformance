package com.performance.module_0_102

class Feature102UseCase1(
    private val repository: Feature102Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
