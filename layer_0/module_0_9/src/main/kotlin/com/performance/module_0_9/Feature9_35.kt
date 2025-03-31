package com.performance.module_0_9

class Feature9UseCase1(
    private val repository: Feature9Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
