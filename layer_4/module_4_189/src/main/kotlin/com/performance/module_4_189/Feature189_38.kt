package com.performance.module_4_189

class Feature189UseCase2(
    private val repository: Feature189Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
