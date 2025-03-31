package com.performance.module_4_295

class Feature295UseCase2(
    private val repository: Feature295Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
