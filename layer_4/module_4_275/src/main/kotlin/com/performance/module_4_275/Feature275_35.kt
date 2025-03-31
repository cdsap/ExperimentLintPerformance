package com.performance.module_4_275

class Feature275UseCase1(
    private val repository: Feature275Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
