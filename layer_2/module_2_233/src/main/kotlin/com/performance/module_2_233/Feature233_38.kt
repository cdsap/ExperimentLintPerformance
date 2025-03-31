package com.performance.module_2_233

class Feature233UseCase2(
    private val repository: Feature233Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
