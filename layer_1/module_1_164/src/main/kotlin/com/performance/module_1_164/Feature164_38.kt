package com.performance.module_1_164

class Feature164UseCase2(
    private val repository: Feature164Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
