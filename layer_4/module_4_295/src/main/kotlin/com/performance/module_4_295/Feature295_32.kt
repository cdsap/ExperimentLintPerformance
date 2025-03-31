package com.performance.module_4_295

class Feature295UseCase0(
    private val repository: Feature295Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
