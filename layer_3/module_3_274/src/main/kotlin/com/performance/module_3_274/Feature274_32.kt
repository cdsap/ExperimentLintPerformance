package com.performance.module_3_274

class Feature274UseCase0(
    private val repository: Feature274Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
