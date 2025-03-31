package com.performance.module_2_158

class Feature158UseCase2(
    private val repository: Feature158Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
