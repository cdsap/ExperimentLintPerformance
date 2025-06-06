package com.performance.module_0_25

class Feature25UseCase2(
    private val repository: Feature25Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
