package com.performance.module_0_127

class Feature127UseCase0(
    private val repository: Feature127Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
