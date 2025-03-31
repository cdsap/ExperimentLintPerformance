package com.performance.module_2_211

class Feature211UseCase1(
    private val repository: Feature211Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
