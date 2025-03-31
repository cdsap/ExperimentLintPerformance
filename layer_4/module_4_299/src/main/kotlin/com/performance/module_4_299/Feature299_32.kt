package com.performance.module_4_299

class Feature299UseCase0(
    private val repository: Feature299Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
