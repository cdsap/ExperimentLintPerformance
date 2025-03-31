package com.performance.module_0_49

class Feature49UseCase2(
    private val repository: Feature49Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
