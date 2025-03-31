package com.performance.module_0_77

class Feature77UseCase1(
    private val repository: Feature77Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
