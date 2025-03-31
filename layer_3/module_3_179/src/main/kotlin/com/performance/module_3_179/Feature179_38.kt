package com.performance.module_3_179

class Feature179UseCase2(
    private val repository: Feature179Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
