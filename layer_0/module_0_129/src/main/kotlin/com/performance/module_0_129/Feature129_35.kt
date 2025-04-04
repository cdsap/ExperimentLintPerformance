package com.performance.module_0_129

class Feature129UseCase1(
    private val repository: Feature129Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
