package com.performance.module_2_233

class Feature233UseCase1(
    private val repository: Feature233Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
