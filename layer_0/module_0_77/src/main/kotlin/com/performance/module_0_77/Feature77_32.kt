package com.performance.module_0_77

class Feature77UseCase0(
    private val repository: Feature77Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
