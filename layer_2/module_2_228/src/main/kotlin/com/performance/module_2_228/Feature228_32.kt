package com.performance.module_2_228

class Feature228UseCase0(
    private val repository: Feature228Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
