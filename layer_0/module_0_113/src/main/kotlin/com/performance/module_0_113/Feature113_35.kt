package com.performance.module_0_113

class Feature113UseCase1(
    private val repository: Feature113Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
