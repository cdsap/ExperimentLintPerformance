package com.performance.module_0_112

class Feature112UseCase2(
    private val repository: Feature112Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
