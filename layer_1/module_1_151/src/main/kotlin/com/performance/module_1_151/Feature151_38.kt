package com.performance.module_1_151

class Feature151UseCase2(
    private val repository: Feature151Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
