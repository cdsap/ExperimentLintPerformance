package com.performance.module_1_104

class Feature104UseCase1(
    private val repository: Feature104Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
