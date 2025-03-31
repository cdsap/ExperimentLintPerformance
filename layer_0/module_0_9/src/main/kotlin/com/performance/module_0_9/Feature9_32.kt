package com.performance.module_0_9

class Feature9UseCase0(
    private val repository: Feature9Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
