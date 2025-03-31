package com.performance.module_1_30

class Feature30UseCase0(
    private val repository: Feature30Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
