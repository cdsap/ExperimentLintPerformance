package com.performance.module_0_30

class Feature30UseCase2(
    private val repository: Feature30Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
