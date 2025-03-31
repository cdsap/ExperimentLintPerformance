package com.performance.module_4_192

class Feature192UseCase0(
    private val repository: Feature192Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
