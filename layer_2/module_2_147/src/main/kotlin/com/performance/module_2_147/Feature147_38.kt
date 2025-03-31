package com.performance.module_2_147

class Feature147UseCase2(
    private val repository: Feature147Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
