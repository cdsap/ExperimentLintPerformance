package com.performance.module_4_275

class Feature275UseCase0(
    private val repository: Feature275Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
