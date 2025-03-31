package com.performance.module_2_242

class Feature242UseCase2(
    private val repository: Feature242Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
