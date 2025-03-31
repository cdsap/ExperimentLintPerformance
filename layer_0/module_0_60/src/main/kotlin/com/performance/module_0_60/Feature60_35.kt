package com.performance.module_0_60

class Feature60UseCase1(
    private val repository: Feature60Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
