package com.performance.module_0_61

class Feature61UseCase2(
    private val repository: Feature61Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
