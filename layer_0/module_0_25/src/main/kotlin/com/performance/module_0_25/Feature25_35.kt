package com.performance.module_0_25

class Feature25UseCase1(
    private val repository: Feature25Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
