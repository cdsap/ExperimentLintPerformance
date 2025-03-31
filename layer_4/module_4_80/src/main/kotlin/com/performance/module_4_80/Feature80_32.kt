package com.performance.module_4_80

class Feature80UseCase0(
    private val repository: Feature80Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
