package com.performance.module_0_103

class Feature103UseCase0(
    private val repository: Feature103Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
