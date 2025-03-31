package com.performance.module_2_237

class Feature237UseCase0(
    private val repository: Feature237Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
