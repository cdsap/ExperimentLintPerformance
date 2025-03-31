package com.performance.module_1_42

class Feature42UseCase0(
    private val repository: Feature42Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
