package com.performance.module_4_86

class Feature86UseCase0(
    private val repository: Feature86Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
