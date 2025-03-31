package com.performance.module_2_214

class Feature214UseCase1(
    private val repository: Feature214Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
