package com.performance.module_0_96

class Feature96UseCase1(
    private val repository: Feature96Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
