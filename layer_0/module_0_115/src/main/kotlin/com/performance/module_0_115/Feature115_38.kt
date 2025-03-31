package com.performance.module_0_115

class Feature115UseCase2(
    private val repository: Feature115Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
