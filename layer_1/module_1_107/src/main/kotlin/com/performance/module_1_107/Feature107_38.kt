package com.performance.module_1_107

class Feature107UseCase2(
    private val repository: Feature107Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
