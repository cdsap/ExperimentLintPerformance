package com.performance.module_0_31

class Feature31UseCase1(
    private val repository: Feature31Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
