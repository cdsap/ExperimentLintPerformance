package com.performance.module_1_114

class Feature114UseCase0(
    private val repository: Feature114Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
