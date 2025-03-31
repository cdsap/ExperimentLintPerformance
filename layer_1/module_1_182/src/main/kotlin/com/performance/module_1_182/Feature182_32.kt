package com.performance.module_1_182

class Feature182UseCase0(
    private val repository: Feature182Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
