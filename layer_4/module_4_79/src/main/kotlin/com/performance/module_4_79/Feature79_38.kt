package com.performance.module_4_79

class Feature79UseCase2(
    private val repository: Feature79Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
