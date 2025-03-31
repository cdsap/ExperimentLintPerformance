package com.performance.module_2_236

class Feature236UseCase0(
    private val repository: Feature236Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
