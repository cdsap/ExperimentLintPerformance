package com.performance.module_0_54

class Feature54UseCase2(
    private val repository: Feature54Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
