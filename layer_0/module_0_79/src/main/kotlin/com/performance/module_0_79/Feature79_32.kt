package com.performance.module_0_79

class Feature79UseCase0(
    private val repository: Feature79Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
