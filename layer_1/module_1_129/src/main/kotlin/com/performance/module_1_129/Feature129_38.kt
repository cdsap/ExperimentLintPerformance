package com.performance.module_1_129

class Feature129UseCase2(
    private val repository: Feature129Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
