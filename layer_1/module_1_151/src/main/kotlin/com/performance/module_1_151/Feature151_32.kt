package com.performance.module_1_151

class Feature151UseCase0(
    private val repository: Feature151Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
