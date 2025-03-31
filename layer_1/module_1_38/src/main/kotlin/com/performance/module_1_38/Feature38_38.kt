package com.performance.module_1_38

class Feature38UseCase2(
    private val repository: Feature38Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
