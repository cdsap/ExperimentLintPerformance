package com.performance.module_1_30

class Feature30UseCase2(
    private val repository: Feature30Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
