package com.performance.module_1_172

class Feature172UseCase2(
    private val repository: Feature172Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
