package com.performance.module_3_172

class Feature172UseCase0(
    private val repository: Feature172Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
