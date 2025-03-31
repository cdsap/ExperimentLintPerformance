package com.performance.module_0_89

class Feature89UseCase2(
    private val repository: Feature89Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
