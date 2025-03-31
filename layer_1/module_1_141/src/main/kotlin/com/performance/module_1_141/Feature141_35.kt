package com.performance.module_1_141

class Feature141UseCase1(
    private val repository: Feature141Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
