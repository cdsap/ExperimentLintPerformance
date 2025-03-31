package com.performance.module_0_53

class Feature53UseCase2(
    private val repository: Feature53Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
