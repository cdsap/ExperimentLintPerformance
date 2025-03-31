package com.performance.module_2_162

class Feature162UseCase1(
    private val repository: Feature162Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
