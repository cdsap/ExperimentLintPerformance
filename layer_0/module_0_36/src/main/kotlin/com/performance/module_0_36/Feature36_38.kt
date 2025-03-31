package com.performance.module_0_36

class Feature36UseCase2(
    private val repository: Feature36Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
