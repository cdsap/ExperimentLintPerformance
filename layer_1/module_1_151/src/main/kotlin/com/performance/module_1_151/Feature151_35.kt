package com.performance.module_1_151

class Feature151UseCase1(
    private val repository: Feature151Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
