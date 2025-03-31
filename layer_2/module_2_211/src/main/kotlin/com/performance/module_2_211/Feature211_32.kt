package com.performance.module_2_211

class Feature211UseCase0(
    private val repository: Feature211Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
