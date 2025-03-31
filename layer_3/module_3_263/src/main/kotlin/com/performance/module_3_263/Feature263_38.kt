package com.performance.module_3_263

class Feature263UseCase2(
    private val repository: Feature263Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
