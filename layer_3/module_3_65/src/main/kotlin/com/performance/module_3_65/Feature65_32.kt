package com.performance.module_3_65

class Feature65UseCase0(
    private val repository: Feature65Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
