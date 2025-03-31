package com.performance.module_2_159

class Feature159UseCase0(
    private val repository: Feature159Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
