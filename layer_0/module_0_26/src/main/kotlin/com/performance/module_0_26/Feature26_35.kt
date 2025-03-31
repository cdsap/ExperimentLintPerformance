package com.performance.module_0_26

class Feature26UseCase1(
    private val repository: Feature26Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
