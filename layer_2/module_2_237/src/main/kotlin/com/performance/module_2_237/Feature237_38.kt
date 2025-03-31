package com.performance.module_2_237

class Feature237UseCase2(
    private val repository: Feature237Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
