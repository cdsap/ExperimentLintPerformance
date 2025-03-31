package com.performance.module_0_102

class Feature102UseCase2(
    private val repository: Feature102Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
