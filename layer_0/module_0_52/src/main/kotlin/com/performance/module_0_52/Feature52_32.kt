package com.performance.module_0_52

class Feature52UseCase0(
    private val repository: Feature52Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
