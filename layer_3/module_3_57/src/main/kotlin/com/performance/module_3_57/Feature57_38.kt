package com.performance.module_3_57

class Feature57UseCase2(
    private val repository: Feature57Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
