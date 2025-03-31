package com.performance.module_0_42

class Feature42UseCase1(
    private val repository: Feature42Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
