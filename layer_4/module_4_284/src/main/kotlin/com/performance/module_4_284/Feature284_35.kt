package com.performance.module_4_284

class Feature284UseCase1(
    private val repository: Feature284Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
