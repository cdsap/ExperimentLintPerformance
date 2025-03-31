package com.performance.module_1_156

class Feature156UseCase0(
    private val repository: Feature156Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
