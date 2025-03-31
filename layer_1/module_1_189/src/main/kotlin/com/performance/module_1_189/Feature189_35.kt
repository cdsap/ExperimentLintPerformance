package com.performance.module_1_189

class Feature189UseCase1(
    private val repository: Feature189Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
