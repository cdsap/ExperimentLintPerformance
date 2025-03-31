package com.performance.module_1_177

class Feature177UseCase2(
    private val repository: Feature177Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
