package com.performance.module_0_53

class Feature53UseCase1(
    private val repository: Feature53Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
