package com.performance.module_4_79

class Feature79UseCase1(
    private val repository: Feature79Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
