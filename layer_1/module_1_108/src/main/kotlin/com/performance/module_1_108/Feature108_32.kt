package com.performance.module_1_108

class Feature108UseCase0(
    private val repository: Feature108Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
