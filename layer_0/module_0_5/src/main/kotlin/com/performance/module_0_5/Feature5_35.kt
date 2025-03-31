package com.performance.module_0_5

class Feature5UseCase1(
    private val repository: Feature5Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
