package com.performance.module_1_96

class Feature96UseCase0(
    private val repository: Feature96Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
