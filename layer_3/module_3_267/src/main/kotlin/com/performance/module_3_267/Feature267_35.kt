package com.performance.module_3_267

class Feature267UseCase1(
    private val repository: Feature267Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
