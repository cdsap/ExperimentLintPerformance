package com.performance.module_0_11

class Feature11UseCase0(
    private val repository: Feature11Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
