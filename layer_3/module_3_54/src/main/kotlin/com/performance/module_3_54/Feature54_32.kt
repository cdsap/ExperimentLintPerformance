package com.performance.module_3_54

class Feature54UseCase0(
    private val repository: Feature54Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
