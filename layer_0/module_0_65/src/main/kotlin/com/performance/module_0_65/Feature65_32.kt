package com.performance.module_0_65

class Feature65UseCase0(
    private val repository: Feature65Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
