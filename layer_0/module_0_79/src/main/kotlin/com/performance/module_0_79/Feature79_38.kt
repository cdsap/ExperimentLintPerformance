package com.performance.module_0_79

class Feature79UseCase2(
    private val repository: Feature79Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
