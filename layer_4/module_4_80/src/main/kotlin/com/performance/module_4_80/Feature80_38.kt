package com.performance.module_4_80

class Feature80UseCase2(
    private val repository: Feature80Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
