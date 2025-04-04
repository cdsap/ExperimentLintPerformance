package com.performance.module_0_57

class Feature57UseCase1(
    private val repository: Feature57Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
