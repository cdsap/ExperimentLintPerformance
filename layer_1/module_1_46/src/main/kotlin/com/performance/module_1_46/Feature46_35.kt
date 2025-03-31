package com.performance.module_1_46

class Feature46UseCase1(
    private val repository: Feature46Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
