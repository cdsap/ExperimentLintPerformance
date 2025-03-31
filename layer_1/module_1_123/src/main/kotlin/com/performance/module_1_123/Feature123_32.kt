package com.performance.module_1_123

class Feature123UseCase0(
    private val repository: Feature123Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
