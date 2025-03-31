package com.performance.module_3_182

class Feature182UseCase2(
    private val repository: Feature182Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
