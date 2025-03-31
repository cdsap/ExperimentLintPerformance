package com.performance.module_0_125

class Feature125UseCase2(
    private val repository: Feature125Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
