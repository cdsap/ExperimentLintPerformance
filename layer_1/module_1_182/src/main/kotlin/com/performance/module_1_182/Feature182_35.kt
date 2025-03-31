package com.performance.module_1_182

class Feature182UseCase1(
    private val repository: Feature182Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
