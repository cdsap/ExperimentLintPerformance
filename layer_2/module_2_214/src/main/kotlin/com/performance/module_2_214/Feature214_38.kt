package com.performance.module_2_214

class Feature214UseCase2(
    private val repository: Feature214Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
