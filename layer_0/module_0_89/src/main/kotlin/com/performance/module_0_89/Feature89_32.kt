package com.performance.module_0_89

class Feature89UseCase0(
    private val repository: Feature89Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
