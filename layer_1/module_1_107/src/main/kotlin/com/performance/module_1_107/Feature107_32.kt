package com.performance.module_1_107

class Feature107UseCase0(
    private val repository: Feature107Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
