package com.performance.module_0_84

class Feature84UseCase0(
    private val repository: Feature84Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
