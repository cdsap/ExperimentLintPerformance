package com.performance.module_4_77

class Feature77UseCase0(
    private val repository: Feature77Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
