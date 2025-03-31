package com.performance.module_3_274

class Feature274UseCase2(
    private val repository: Feature274Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
