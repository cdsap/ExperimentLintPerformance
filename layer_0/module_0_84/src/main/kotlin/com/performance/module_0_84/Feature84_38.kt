package com.performance.module_0_84

class Feature84UseCase2(
    private val repository: Feature84Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
