package com.performance.module_0_108

class Feature108UseCase2(
    private val repository: Feature108Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
