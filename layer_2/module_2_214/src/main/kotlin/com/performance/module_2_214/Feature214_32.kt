package com.performance.module_2_214

class Feature214UseCase0(
    private val repository: Feature214Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
