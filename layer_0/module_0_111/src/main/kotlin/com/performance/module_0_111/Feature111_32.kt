package com.performance.module_0_111

class Feature111UseCase0(
    private val repository: Feature111Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
