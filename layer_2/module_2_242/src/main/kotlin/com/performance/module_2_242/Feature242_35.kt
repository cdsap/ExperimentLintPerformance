package com.performance.module_2_242

class Feature242UseCase1(
    private val repository: Feature242Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
