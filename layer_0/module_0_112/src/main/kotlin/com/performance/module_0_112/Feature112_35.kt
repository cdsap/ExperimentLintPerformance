package com.performance.module_0_112

class Feature112UseCase1(
    private val repository: Feature112Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
