package com.performance.module_0_107

class Feature107UseCase1(
    private val repository: Feature107Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
