package com.performance.module_0_86

class Feature86UseCase2(
    private val repository: Feature86Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
