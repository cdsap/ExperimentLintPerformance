package com.performance.module_0_115

class Feature115UseCase1(
    private val repository: Feature115Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
