package com.performance.module_4_75

class Feature75UseCase0(
    private val repository: Feature75Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
