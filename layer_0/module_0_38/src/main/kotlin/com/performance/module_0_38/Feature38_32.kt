package com.performance.module_0_38

class Feature38UseCase0(
    private val repository: Feature38Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
