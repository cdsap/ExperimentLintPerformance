package com.performance.module_1_193

class Feature193UseCase0(
    private val repository: Feature193Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
