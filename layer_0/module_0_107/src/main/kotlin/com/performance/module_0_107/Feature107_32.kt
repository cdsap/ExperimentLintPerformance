package com.performance.module_0_107

class Feature107UseCase0(
    private val repository: Feature107Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
