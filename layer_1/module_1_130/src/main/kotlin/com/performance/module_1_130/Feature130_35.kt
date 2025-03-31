package com.performance.module_1_130

class Feature130UseCase1(
    private val repository: Feature130Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
