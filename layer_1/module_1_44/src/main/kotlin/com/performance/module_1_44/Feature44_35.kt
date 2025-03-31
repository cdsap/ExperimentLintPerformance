package com.performance.module_1_44

class Feature44UseCase1(
    private val repository: Feature44Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
