package com.performance.module_4_189

class Feature189UseCase1(
    private val repository: Feature189Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
