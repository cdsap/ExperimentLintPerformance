package com.performance.module_2_233

class Feature233UseCase0(
    private val repository: Feature233Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
