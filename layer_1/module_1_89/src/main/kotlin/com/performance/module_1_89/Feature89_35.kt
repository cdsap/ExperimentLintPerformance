package com.performance.module_1_89

class Feature89UseCase1(
    private val repository: Feature89Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
