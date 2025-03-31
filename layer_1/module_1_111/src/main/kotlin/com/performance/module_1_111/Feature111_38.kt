package com.performance.module_1_111

class Feature111UseCase2(
    private val repository: Feature111Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
