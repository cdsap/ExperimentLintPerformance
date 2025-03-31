package com.performance.module_0_53

class Feature53UseCase0(
    private val repository: Feature53Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
