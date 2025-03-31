package com.performance.module_2_228

class Feature228UseCase1(
    private val repository: Feature228Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
