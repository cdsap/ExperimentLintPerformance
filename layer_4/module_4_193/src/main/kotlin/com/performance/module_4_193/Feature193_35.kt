package com.performance.module_4_193

class Feature193UseCase1(
    private val repository: Feature193Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
