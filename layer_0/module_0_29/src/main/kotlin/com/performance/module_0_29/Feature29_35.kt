package com.performance.module_0_29

class Feature29UseCase1(
    private val repository: Feature29Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
