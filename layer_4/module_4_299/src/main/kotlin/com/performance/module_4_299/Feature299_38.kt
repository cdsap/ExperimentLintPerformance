package com.performance.module_4_299

class Feature299UseCase2(
    private val repository: Feature299Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
