package com.performance.module_1_125

class Feature125UseCase1(
    private val repository: Feature125Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
