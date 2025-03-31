package com.performance.module_0_38

class Feature38UseCase1(
    private val repository: Feature38Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
