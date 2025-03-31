package com.performance.module_0_103

class Feature103UseCase2(
    private val repository: Feature103Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
