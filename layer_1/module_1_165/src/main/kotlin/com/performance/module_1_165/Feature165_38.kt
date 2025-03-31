package com.performance.module_1_165

class Feature165UseCase2(
    private val repository: Feature165Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
