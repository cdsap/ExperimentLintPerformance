package com.performance.module_0_26

class Feature26UseCase2(
    private val repository: Feature26Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
