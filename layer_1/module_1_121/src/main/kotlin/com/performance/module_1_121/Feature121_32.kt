package com.performance.module_1_121

class Feature121UseCase0(
    private val repository: Feature121Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
