package com.performance.module_1_21

class Feature21UseCase1(
    private val repository: Feature21Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
