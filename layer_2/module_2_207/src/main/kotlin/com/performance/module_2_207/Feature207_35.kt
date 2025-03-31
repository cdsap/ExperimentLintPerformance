package com.performance.module_2_207

class Feature207UseCase1(
    private val repository: Feature207Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
