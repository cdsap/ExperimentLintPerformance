package com.performance.module_1_115

class Feature115UseCase0(
    private val repository: Feature115Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
