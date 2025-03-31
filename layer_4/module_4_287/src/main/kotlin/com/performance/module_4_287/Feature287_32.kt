package com.performance.module_4_287

class Feature287UseCase0(
    private val repository: Feature287Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
