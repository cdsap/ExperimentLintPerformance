package com.performance.module_1_196

class Feature196UseCase2(
    private val repository: Feature196Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
