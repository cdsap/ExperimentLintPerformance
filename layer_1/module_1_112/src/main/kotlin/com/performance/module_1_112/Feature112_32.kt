package com.performance.module_1_112

class Feature112UseCase0(
    private val repository: Feature112Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
