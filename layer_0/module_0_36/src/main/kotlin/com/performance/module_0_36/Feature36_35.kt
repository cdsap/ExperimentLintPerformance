package com.performance.module_0_36

class Feature36UseCase1(
    private val repository: Feature36Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
