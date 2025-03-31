package com.performance.module_1_107

class Feature107UseCase1(
    private val repository: Feature107Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
