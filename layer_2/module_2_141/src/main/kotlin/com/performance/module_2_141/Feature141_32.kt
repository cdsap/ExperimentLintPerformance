package com.performance.module_2_141

class Feature141UseCase0(
    private val repository: Feature141Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
