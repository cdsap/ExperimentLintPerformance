package com.performance.module_2_156

class Feature156UseCase1(
    private val repository: Feature156Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
