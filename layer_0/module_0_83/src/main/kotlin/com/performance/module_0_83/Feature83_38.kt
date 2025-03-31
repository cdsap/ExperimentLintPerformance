package com.performance.module_0_83

class Feature83UseCase2(
    private val repository: Feature83Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
