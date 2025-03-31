package com.performance.module_2_236

class Feature236UseCase2(
    private val repository: Feature236Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
