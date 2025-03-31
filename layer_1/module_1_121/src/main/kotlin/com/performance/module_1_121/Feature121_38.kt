package com.performance.module_1_121

class Feature121UseCase2(
    private val repository: Feature121Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
