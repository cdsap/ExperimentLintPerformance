package com.performance.module_0_99

class Feature99UseCase1(
    private val repository: Feature99Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
