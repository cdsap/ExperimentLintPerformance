package com.performance.module_0_52

class Feature52UseCase2(
    private val repository: Feature52Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
