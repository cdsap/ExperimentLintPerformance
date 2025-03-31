package com.performance.module_4_295

class Feature295UseCase1(
    private val repository: Feature295Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
