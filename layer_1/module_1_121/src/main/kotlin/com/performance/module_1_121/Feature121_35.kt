package com.performance.module_1_121

class Feature121UseCase1(
    private val repository: Feature121Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
