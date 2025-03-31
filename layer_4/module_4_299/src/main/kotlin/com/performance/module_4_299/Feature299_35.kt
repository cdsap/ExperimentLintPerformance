package com.performance.module_4_299

class Feature299UseCase1(
    private val repository: Feature299Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
