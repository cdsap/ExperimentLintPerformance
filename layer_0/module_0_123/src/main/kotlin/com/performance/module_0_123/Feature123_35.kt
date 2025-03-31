package com.performance.module_0_123

class Feature123UseCase1(
    private val repository: Feature123Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
