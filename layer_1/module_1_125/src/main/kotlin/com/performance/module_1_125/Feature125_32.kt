package com.performance.module_1_125

class Feature125UseCase0(
    private val repository: Feature125Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
