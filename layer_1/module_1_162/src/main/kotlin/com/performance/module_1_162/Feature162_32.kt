package com.performance.module_1_162

class Feature162UseCase0(
    private val repository: Feature162Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
