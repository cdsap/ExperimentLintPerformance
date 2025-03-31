package com.performance.module_3_249

class Feature249UseCase0(
    private val repository: Feature249Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
