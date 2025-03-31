package com.performance.module_1_102

class Feature102UseCase0(
    private val repository: Feature102Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
