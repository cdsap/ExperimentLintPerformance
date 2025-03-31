package com.performance.module_0_36

class Feature36UseCase0(
    private val repository: Feature36Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
