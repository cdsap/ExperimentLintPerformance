package com.performance.module_2_242

class Feature242UseCase0(
    private val repository: Feature242Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
