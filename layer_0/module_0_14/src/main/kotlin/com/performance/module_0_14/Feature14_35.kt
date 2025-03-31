package com.performance.module_0_14

class Feature14UseCase1(
    private val repository: Feature14Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
