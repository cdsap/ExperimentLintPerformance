package com.performance.module_1_96

class Feature96UseCase2(
    private val repository: Feature96Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
