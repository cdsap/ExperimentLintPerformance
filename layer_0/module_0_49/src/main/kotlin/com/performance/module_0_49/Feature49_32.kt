package com.performance.module_0_49

class Feature49UseCase0(
    private val repository: Feature49Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
