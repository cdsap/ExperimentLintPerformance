package com.performance.module_2_236

class Feature236UseCase1(
    private val repository: Feature236Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
