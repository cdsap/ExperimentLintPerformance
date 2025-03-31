package com.performance.module_1_43

class Feature43UseCase1(
    private val repository: Feature43Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
