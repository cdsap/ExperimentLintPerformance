package com.performance.module_0_61

class Feature61UseCase1(
    private val repository: Feature61Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
