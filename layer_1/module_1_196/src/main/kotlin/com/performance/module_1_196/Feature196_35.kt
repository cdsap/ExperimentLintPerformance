package com.performance.module_1_196

class Feature196UseCase1(
    private val repository: Feature196Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
