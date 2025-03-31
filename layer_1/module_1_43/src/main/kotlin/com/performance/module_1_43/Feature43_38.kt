package com.performance.module_1_43

class Feature43UseCase2(
    private val repository: Feature43Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
