package com.performance.module_0_49

class Feature49UseCase1(
    private val repository: Feature49Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
