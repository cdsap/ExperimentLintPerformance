package com.performance.module_0_84

class Feature84UseCase1(
    private val repository: Feature84Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
