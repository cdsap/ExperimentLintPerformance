package com.performance.module_1_165

class Feature165UseCase0(
    private val repository: Feature165Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
