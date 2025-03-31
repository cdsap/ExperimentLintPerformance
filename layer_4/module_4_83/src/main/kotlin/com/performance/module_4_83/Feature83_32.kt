package com.performance.module_4_83

class Feature83UseCase0(
    private val repository: Feature83Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
