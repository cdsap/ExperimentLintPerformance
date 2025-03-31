package com.performance.module_4_298

class Feature298UseCase0(
    private val repository: Feature298Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
