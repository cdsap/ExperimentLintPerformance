package com.performance.module_1_45

class Feature45UseCase1(
    private val repository: Feature45Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
