package com.performance.module_0_80

class Feature80UseCase1(
    private val repository: Feature80Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
