package com.performance.module_3_267

class Feature267UseCase2(
    private val repository: Feature267Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
