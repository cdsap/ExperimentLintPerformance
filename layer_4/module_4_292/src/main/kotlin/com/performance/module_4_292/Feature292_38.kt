package com.performance.module_4_292

class Feature292UseCase2(
    private val repository: Feature292Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
