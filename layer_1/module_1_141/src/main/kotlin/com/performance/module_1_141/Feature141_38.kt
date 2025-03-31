package com.performance.module_1_141

class Feature141UseCase2(
    private val repository: Feature141Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
