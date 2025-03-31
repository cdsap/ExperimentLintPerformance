package com.performance.module_0_73

class Feature73UseCase1(
    private val repository: Feature73Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
