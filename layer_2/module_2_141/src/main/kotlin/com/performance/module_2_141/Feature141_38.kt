package com.performance.module_2_141

class Feature141UseCase2(
    private val repository: Feature141Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
