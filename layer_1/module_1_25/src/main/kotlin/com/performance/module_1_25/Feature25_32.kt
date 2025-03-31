package com.performance.module_1_25

class Feature25UseCase0(
    private val repository: Feature25Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
