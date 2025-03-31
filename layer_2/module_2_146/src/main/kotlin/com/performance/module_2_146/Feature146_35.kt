package com.performance.module_2_146

class Feature146UseCase1(
    private val repository: Feature146Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
