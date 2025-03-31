package com.performance.module_1_103

class Feature103UseCase0(
    private val repository: Feature103Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
