package com.performance.module_1_44

class Feature44UseCase0(
    private val repository: Feature44Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
