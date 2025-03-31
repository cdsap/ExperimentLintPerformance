package com.performance.module_3_249

class Feature249UseCase2(
    private val repository: Feature249Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
