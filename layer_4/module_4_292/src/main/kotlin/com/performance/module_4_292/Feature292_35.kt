package com.performance.module_4_292

class Feature292UseCase1(
    private val repository: Feature292Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
