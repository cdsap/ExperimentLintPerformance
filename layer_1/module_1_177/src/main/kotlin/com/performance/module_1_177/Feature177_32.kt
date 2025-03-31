package com.performance.module_1_177

class Feature177UseCase0(
    private val repository: Feature177Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
