package com.performance.module_0_52

class Feature52UseCase1(
    private val repository: Feature52Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
