package com.performance.module_2_159

class Feature159UseCase1(
    private val repository: Feature159Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
