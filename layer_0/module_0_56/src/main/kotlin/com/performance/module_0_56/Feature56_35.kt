package com.performance.module_0_56

class Feature56UseCase1(
    private val repository: Feature56Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
