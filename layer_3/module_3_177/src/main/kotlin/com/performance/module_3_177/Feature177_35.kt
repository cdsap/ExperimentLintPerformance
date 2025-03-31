package com.performance.module_3_177

class Feature177UseCase1(
    private val repository: Feature177Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
