package com.performance.module_2_228

class Feature228UseCase2(
    private val repository: Feature228Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
