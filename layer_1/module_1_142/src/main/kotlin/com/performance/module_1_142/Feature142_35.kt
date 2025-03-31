package com.performance.module_1_142

class Feature142UseCase1(
    private val repository: Feature142Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
