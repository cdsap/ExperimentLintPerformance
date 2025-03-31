package com.performance.module_0_77

class Feature77UseCase2(
    private val repository: Feature77Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
