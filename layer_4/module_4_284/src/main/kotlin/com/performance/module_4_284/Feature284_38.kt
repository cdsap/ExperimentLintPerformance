package com.performance.module_4_284

class Feature284UseCase2(
    private val repository: Feature284Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
