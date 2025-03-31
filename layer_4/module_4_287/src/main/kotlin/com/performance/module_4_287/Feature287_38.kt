package com.performance.module_4_287

class Feature287UseCase2(
    private val repository: Feature287Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
