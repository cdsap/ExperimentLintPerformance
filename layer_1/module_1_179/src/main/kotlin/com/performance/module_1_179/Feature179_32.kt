package com.performance.module_1_179

class Feature179UseCase0(
    private val repository: Feature179Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
