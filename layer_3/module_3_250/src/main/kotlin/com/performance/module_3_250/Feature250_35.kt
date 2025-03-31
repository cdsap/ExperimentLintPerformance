package com.performance.module_3_250

class Feature250UseCase1(
    private val repository: Feature250Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
