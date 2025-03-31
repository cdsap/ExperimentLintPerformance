package com.performance.module_1_104

class Feature104UseCase2(
    private val repository: Feature104Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
