package com.performance.module_2_237

class Feature237UseCase1(
    private val repository: Feature237Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
