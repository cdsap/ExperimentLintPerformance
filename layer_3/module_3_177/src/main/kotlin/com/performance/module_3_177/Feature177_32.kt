package com.performance.module_3_177

class Feature177UseCase0(
    private val repository: Feature177Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
