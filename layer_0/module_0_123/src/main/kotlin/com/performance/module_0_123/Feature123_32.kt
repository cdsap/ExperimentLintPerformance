package com.performance.module_0_123

class Feature123UseCase0(
    private val repository: Feature123Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
