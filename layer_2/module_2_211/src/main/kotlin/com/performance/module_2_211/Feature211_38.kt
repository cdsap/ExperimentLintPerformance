package com.performance.module_2_211

class Feature211UseCase2(
    private val repository: Feature211Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
