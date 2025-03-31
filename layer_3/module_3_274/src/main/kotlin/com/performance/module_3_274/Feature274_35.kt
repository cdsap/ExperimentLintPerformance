package com.performance.module_3_274

class Feature274UseCase1(
    private val repository: Feature274Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
