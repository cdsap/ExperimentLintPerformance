package com.performance.module_2_158

class Feature158UseCase0(
    private val repository: Feature158Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
