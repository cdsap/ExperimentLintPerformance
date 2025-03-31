package com.performance.module_1_193

class Feature193UseCase2(
    private val repository: Feature193Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
