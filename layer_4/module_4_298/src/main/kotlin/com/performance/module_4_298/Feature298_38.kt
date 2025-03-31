package com.performance.module_4_298

class Feature298UseCase2(
    private val repository: Feature298Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
