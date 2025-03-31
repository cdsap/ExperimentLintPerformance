package com.performance.module_1_156

class Feature156UseCase2(
    private val repository: Feature156Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
