package com.performance.module_0_104

class Feature104UseCase0(
    private val repository: Feature104Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
