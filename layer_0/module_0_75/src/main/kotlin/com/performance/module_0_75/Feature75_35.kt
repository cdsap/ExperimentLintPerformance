package com.performance.module_0_75

class Feature75UseCase1(
    private val repository: Feature75Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
