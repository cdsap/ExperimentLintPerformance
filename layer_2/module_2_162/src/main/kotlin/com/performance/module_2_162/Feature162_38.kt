package com.performance.module_2_162

class Feature162UseCase2(
    private val repository: Feature162Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
