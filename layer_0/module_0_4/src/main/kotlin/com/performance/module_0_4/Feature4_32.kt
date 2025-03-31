package com.performance.module_0_4

class Feature4UseCase0(
    private val repository: Feature4Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
