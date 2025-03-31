package com.performance.module_0_111

class Feature111UseCase1(
    private val repository: Feature111Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
