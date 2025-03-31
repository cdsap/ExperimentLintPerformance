package com.performance.module_3_74

class Feature74UseCase1(
    private val repository: Feature74Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
