package com.performance.module_0_114

class Feature114UseCase1(
    private val repository: Feature114Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
