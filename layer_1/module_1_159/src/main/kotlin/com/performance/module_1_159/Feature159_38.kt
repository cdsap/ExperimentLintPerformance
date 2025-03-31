package com.performance.module_1_159

class Feature159UseCase2(
    private val repository: Feature159Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
