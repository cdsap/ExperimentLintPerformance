package com.performance.module_0_114

class Feature114UseCase2(
    private val repository: Feature114Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
