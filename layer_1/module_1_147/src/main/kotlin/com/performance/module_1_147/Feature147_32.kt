package com.performance.module_1_147

class Feature147UseCase0(
    private val repository: Feature147Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
