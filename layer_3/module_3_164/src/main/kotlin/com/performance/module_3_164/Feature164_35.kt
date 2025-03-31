package com.performance.module_3_164

class Feature164UseCase1(
    private val repository: Feature164Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
