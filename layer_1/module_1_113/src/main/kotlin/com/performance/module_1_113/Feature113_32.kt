package com.performance.module_1_113

class Feature113UseCase0(
    private val repository: Feature113Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
