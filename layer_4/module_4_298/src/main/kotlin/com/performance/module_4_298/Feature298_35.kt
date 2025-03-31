package com.performance.module_4_298

class Feature298UseCase1(
    private val repository: Feature298Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
