package com.performance.module_0_129

class Feature129UseCase0(
    private val repository: Feature129Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
