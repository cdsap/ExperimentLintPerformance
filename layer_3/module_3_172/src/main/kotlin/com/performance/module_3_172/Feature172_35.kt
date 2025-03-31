package com.performance.module_3_172

class Feature172UseCase1(
    private val repository: Feature172Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
