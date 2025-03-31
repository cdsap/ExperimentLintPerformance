package com.performance.module_0_43

class Feature43UseCase0(
    private val repository: Feature43Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
