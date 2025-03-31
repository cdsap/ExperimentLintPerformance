package com.performance.module_3_54

class Feature54UseCase1(
    private val repository: Feature54Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
