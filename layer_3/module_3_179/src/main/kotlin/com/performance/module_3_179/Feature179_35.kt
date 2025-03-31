package com.performance.module_3_179

class Feature179UseCase1(
    private val repository: Feature179Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
