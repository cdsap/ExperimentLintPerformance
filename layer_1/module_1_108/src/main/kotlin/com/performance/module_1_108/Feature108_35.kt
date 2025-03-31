package com.performance.module_1_108

class Feature108UseCase1(
    private val repository: Feature108Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
