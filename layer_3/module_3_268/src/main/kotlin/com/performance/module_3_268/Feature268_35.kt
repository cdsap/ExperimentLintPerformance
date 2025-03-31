package com.performance.module_3_268

class Feature268UseCase1(
    private val repository: Feature268Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
