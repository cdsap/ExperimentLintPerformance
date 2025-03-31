package com.performance.module_3_57

class Feature57UseCase0(
    private val repository: Feature57Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
