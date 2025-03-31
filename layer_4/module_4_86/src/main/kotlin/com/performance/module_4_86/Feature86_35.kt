package com.performance.module_4_86

class Feature86UseCase1(
    private val repository: Feature86Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
