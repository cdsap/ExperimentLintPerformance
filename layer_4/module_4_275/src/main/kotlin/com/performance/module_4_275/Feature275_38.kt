package com.performance.module_4_275

class Feature275UseCase2(
    private val repository: Feature275Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
