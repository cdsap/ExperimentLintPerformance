package com.performance.module_0_127

class Feature127UseCase2(
    private val repository: Feature127Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
