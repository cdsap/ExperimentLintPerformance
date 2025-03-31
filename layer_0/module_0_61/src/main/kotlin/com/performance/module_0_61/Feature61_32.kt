package com.performance.module_0_61

class Feature61UseCase0(
    private val repository: Feature61Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
