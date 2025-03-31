package com.performance.module_0_26

class Feature26UseCase0(
    private val repository: Feature26Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
