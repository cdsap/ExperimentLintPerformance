package com.performance.module_4_77

class Feature77UseCase1(
    private val repository: Feature77Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
