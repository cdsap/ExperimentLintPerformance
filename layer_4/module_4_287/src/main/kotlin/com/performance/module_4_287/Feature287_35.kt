package com.performance.module_4_287

class Feature287UseCase1(
    private val repository: Feature287Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
