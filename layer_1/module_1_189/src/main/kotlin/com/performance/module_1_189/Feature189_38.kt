package com.performance.module_1_189

class Feature189UseCase2(
    private val repository: Feature189Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
