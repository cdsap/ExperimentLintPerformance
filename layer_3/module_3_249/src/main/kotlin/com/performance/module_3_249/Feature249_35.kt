package com.performance.module_3_249

class Feature249UseCase1(
    private val repository: Feature249Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
