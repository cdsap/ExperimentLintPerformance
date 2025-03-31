package com.performance.module_2_207

class Feature207UseCase0(
    private val repository: Feature207Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
