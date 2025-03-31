package com.performance.module_4_284

class Feature284UseCase0(
    private val repository: Feature284Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
