package com.performance.module_3_261

class Feature261UseCase1(
    private val repository: Feature261Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
