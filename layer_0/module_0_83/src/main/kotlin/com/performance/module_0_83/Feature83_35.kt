package com.performance.module_0_83

class Feature83UseCase1(
    private val repository: Feature83Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
