package com.performance.module_3_257

class Feature257UseCase1(
    private val repository: Feature257Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
