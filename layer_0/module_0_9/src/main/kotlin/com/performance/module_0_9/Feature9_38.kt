package com.performance.module_0_9

class Feature9UseCase2(
    private val repository: Feature9Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
