package com.performance.module_4_83

class Feature83UseCase2(
    private val repository: Feature83Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
