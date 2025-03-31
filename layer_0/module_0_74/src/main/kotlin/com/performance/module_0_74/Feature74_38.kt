package com.performance.module_0_74

class Feature74UseCase2(
    private val repository: Feature74Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
