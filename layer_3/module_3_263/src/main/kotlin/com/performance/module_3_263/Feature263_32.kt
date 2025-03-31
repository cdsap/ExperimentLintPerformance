package com.performance.module_3_263

class Feature263UseCase0(
    private val repository: Feature263Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
