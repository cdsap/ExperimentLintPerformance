package com.performance.module_3_263

class Feature263UseCase1(
    private val repository: Feature263Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
