package com.performance.module_1_125

class Feature125UseCase2(
    private val repository: Feature125Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
