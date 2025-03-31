package com.performance.module_0_1

class Feature1UseCase1(
    private val repository: Feature1Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
