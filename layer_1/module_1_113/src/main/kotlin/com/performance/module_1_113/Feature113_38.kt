package com.performance.module_1_113

class Feature113UseCase2(
    private val repository: Feature113Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
