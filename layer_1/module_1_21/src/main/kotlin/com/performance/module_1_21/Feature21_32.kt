package com.performance.module_1_21

class Feature21UseCase0(
    private val repository: Feature21Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
