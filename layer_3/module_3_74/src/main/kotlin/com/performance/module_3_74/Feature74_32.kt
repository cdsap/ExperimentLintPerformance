package com.performance.module_3_74

class Feature74UseCase0(
    private val repository: Feature74Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
