package com.performance.module_0_11

class Feature11UseCase2(
    private val repository: Feature11Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
