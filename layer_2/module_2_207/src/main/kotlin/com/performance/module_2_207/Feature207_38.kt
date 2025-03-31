package com.performance.module_2_207

class Feature207UseCase2(
    private val repository: Feature207Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
