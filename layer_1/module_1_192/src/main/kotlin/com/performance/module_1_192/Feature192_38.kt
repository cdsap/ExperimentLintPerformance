package com.performance.module_1_192

class Feature192UseCase2(
    private val repository: Feature192Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
