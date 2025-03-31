package com.performance.module_0_21

class Feature21UseCase2(
    private val repository: Feature21Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
