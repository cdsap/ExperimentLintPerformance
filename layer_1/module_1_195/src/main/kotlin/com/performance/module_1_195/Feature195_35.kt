package com.performance.module_1_195

class Feature195UseCase1(
    private val repository: Feature195Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
