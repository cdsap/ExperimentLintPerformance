package com.performance.module_0_127

class Feature127UseCase1(
    private val repository: Feature127Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
