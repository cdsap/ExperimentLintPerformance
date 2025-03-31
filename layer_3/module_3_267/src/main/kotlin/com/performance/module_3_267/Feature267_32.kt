package com.performance.module_3_267

class Feature267UseCase0(
    private val repository: Feature267Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
