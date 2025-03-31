package com.performance.module_0_11

class Feature11UseCase1(
    private val repository: Feature11Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
