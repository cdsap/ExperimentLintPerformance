package com.performance.module_4_196

class Feature196UseCase0(
    private val repository: Feature196Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
