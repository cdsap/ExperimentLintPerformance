package com.performance.module_1_104

class Feature104UseCase0(
    private val repository: Feature104Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
