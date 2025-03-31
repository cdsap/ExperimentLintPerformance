package com.performance.module_0_123

class Feature123UseCase2(
    private val repository: Feature123Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
